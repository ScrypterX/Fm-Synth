{
	var l = Line.kr(1, 20000,19);
	var l2 = Line.kr(1, 40000,19);
	var x = SinOsc.ar();
	var x2 = SinOsc.ar(x);
	var mx = MouseX.kr(0,20000);
	var my = MouseY.kr(0,20000);
	var sound = SinOsc.ar(mx*x2*l + my*x2*l2, 0, 0.1);
	[sound,sound]
}.play;