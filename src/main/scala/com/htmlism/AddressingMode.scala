package com.htmlism

sealed trait AddressingMode

case object Immediate   extends AddressingMode
case object ZeroPage    extends AddressingMode
case object ZeroPageX   extends AddressingMode
case object Absolute    extends AddressingMode
case object AbsoluteX   extends AddressingMode
case object AbsoluteY   extends AddressingMode
case object IndirectX   extends AddressingMode
case object IndirectY   extends AddressingMode
case object Relative    extends AddressingMode
case object Accumulator extends AddressingMode
case object Implied     extends AddressingMode
case object NoMode      extends AddressingMode
