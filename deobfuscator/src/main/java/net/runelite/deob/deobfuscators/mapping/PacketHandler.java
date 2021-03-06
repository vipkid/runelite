/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package net.runelite.deob.deobfuscators.mapping;

import java.util.List;
import net.runelite.asm.attributes.code.Instruction;
import net.runelite.asm.attributes.code.Label;
import net.runelite.asm.attributes.code.instructions.If;
import net.runelite.asm.attributes.code.instructions.IfICmpEq;
import net.runelite.asm.attributes.code.instructions.IfICmpNe;

public class PacketHandler
{
	private final If branchInstruction;
	private final int packetId;

	public PacketHandler(If branchInstruction, int packetId)
	{
		this.branchInstruction = branchInstruction;
		this.packetId = packetId;
	}

	public If getBranchInstruction()
	{
		return branchInstruction;
	}

	public int getPacketId()
	{
		return packetId;
	}

	@Override
	public String toString()
	{
		return "PacketHandler{" + "packetId=" + packetId + '}';
	}

	public Instruction getFirstInsOfHandler()
	{
		if (branchInstruction instanceof IfICmpNe)
		{
			List<Instruction> ins = branchInstruction.getInstructions().getInstructions();
			int idx = ins.indexOf(branchInstruction);
			assert idx != -1;
			return ins.get(idx + 1);
		}
		else if (branchInstruction instanceof IfICmpEq)
		{
			List<Label> jumps = branchInstruction.getJumps();
			assert jumps.size() == 1;
			return jumps.get(0).next();
		}
		else
		{
			assert false;
			return null;
		}
	}
}
