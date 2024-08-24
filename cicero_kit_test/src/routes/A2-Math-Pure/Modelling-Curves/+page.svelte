<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Modelling-Curves</title></svelte:head><div class="note">
   <h1 class="title">Modelling-Curves</h1>
<h2 class="heading"> Power Function</h2>
<h2 class="heading"> <Katex math={"y=kx^n"} displayMode/></h2>
<h2 class="heading"> <Katex math={"x\\ is\\ to\\ the\\ power\\ n"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = bx^4"} displayMode/></h2>
<p>Always for the graph log k vs log d</p>
<h2 class="heading"> Exponential Function</h2>
<h2 class="heading"> <Katex math={"y=ka^x"} displayMode/></h2>
<h2 class="heading"> <Katex math={" x\\ is\\ an\\ exponent"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = 2(3)^x"} displayMode/></h2>
<p>Always for the graph log k vs d</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p>A water pipe is going to be laid between two points and an investigation is carried out as to how, fora given pressure difference, the rate of flow R liters per second varies with the diameter of the pipe d cm. The following data is collected:</p>
<p></p>
<p>| d (cm)  | 1    | 2   | 3   | 5   | 10  |</p>
<p>| ------- | ---- | --- | --- | --- | --- |</p>
<p>| R (L/s) | 0.02 | 0.32    | 1.62    | 12.53    | 199.80    |</p>
<p>It is suspected that the relationship between R and d may be of the form </p>
<p><Katex math={" R=kd^n"} displayMode/></p>
<p><Katex math={"where\\ k\\ and\\ d\\ are\\ constants"} displayMode/></p>
<p>1) Explain how the graph of log d against log R tells you whether this is a good model for the relationship</p>
<p></p>
<p>_We must show that log d vs log R gives us a straight line equation form. _</p>
<p><Katex math={"R = kd^n"} displayMode/></p>
<p><Katex math={"\\log R = \\log kd^n"} displayMode/></p>
<p><Katex math={"\\log R = \\log k + n\\log d"} displayMode/></p>
<p><Katex math={"y = mx + c"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\log R = n\\log d + \\log k"} displayMode/></p>
<p></p>
<p>2) Make a table of values of log d against log R and plot these on a graph.</p>
<p></p>
<p>| D     | 1   | 2   | 3   | 5   | 10  |</p>
<p>| ----- | --- | --- | --- | --- | --- |</p>
<p>| R     | 0.02    | 0.32    | 1.62    | 12.53    | 199.80    |</p>
<p>| log d | 0    | 0.30103    | 0.477121    | 0.69897    | 1    |</p>
<p>| log R      | -1.69897    | -0.49485    | 0.209515    | 1.097951    | 2.300595    |</p>
<p></p>
<img src="/Attachements/Pastedimage20240214210816.png" alt="diagram">
<p></p>
<p>So the power equation <Katex math={"y=kx^n"}/> works! It requires that we plot log y vs log x. Log y vs x does not give a straight line. This is what we plot for the exponential function model <Katex math={"y=ka^x"}/> </p>
<p></p>
<p>3) Find the relationship between d and R. i.e. find the rule that links d and R using your graph to estimate the values of n and k.</p>
<p></p>
<p><Katex math={"\\log R = n\\log d + \\log k"} displayMode/></p>
<p><Katex math={"use\\ the\\ table\\ of\\ data\\ and\\ graph"} displayMode/></p>
<p><Katex math={"-1.69897 = \\log k + n0"} displayMode/></p>
<p><Katex math={"\\log k = 10^{-1.69897}"} displayMode/></p>
<p><Katex math={"k = 0.0200"} displayMode/></p>
<p><Katex math={"R = 0.02d^4"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"n = \\frac{2.3000595 + 1.69897}{1-0}"} displayMode/></p>
<p><Katex math={"=3.999565"} displayMode/></p>
<p><Katex math={"\\approx 4"} displayMode/></p>
<p></p>
<p></p>
<h4 class="heading"> Finding n & k quickly using algebra</h4>
<p><Katex math={"(1, 0.02)\\ (2, 0.32)"} displayMode/></p>
<p><Katex math={"R = kd^n"} displayMode/></p>
<p><Katex math={"0.02 = k1^n"} displayMode/></p>
<p><Katex math={"\\therefore k = 0.02"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"0.32 = k.2^n"} displayMode/></p>
<p><Katex math={"0.32 = (0.02)2^n"} displayMode/></p>
<p><Katex math={"16 = 2^n"} displayMode/></p>
<p><Katex math={"\\therefore n = 4"} displayMode/></p>
<p><Katex math={"R = 0.02d^4"} displayMode/></p>
</div>