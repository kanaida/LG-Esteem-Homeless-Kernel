@ This file was created from a .asm file
@  using the ads2gas.pl script.
	.equ DO1STROUNDING, 0
@
@  Copyright (c) 2010 The WebM project authors. All Rights Reserved.
@
@  Use of this source code is governed by a BSD-style license
@  that can be found in the LICENSE file in the root of the source
@  tree. An additional intellectual property rights grant can be found
@  in the file PATENTS.  All contributing project authors may
@  be found in the AUTHORS file in the root of the source tree.
@


    .global vp8_push_neon 
	.type vp8_push_neon, function
    .global vp8_pop_neon 
	.type vp8_pop_neon, function

   @ ARM
   @ 
   @ PRESERVE8

.text

_vp8_push_neon:
	vp8_push_neon:@
    vst1.i64            {d8, d9, d10, d11}, [r0]!
    vst1.i64            {d12, d13, d14, d15}, [r0]!
    bx              lr

   @

_vp8_pop_neon:
	vp8_pop_neon:@
    vld1.i64            {d8, d9, d10, d11}, [r0]!
    vld1.i64            {d12, d13, d14, d15}, [r0]!
    bx              lr

   @


