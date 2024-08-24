<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Logs</title></svelte:head><div class="note">
   <h1 class="title">Logs</h1>
<h2 class="heading"> <Katex math={" \\log_232 = 5"} displayMode/></h2>
<h2 class="heading"> <Katex math={" 2^5 = 32"} displayMode/></h2>
<img src="/graphs/Logs0.png" alt="graph">
<p><Katex math={" y = 2^x"} displayMode/></p>
<img src="/graphs/Logs1.png" alt="graph">
<p><Katex math={" \\log_2x = y"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (1)</h2>
<h3 class="heading"> <Katex math={"\\log_bx = y"} displayMode/></h3>
<h3 class="heading"> <Katex math={"b^y = x"} displayMode/></h3>
<h3 class="heading"> <Katex math={"b > 0"} displayMode/></h3>
<p>_If b is less than 0, then the graph oscillates across up and down the y-axis_</p>
<p></p>
<p><Katex math={"b \\ne 1"}/> because <Katex math={"\\log_1x = y"}/></p>
<p><Katex math={"1^y = x"}/> </p>
<p><Katex math={"\\therefore x = 1"}/> always</p>
<p></p>
<p><Katex math={"x > 0"}/> because <Katex math={"b > 0"}/></p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (2)</h2>
<h3 class="heading"> <Katex math={"\\log a = \\log_{10}a"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (3)</h2>
<h3 class="heading"> <Katex math={" \\log_xw = \\frac{\\log w}{\\log x}"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (4)</h2>
<h3 class="heading"> <Katex math={" \\log x^a = a\\log x"} displayMode/></h3>
<p><Katex math={"4^{3x+1} = 7^{x-3}"} displayMode/></p>
<p><Katex math={"\\log 4^{3x+1} = \\log 7^{x-3}"} displayMode/></p>
<p><Katex math={" (3x+1)\\log 4 = (x-3) \\log 7"} displayMode/></p>
<p><Katex math={"3x\\log 4 + \\log 4 = x\\log7 - 3\\log7"} displayMode/></p>
<p><Katex math={"3x\\log 4 - x\\log 7 = -3\\log 7 - \\log4"} displayMode/></p>
<p><Katex math={"\\frac{x(3\\log 4 - \\log7)}{(3\\log 4 - \\log7)} = \\frac{3\\log7 - \\log4}{(3\\log4 - \\log7)}"} displayMode/></p>
<p><Katex math={" x = -3.26\\ (3sf)"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (5)</h2>
<h3 class="heading"> <Katex math={"\\log a + \\log b = \\log a*b"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (6)</h2>
<h3 class="heading"> <Katex math={"\\log a - \\log b = \\log \\frac{a}b"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> (7)</h2>
<h3 class="heading"> <Katex math={" \\frac{\\log 4}{\\log 4x} \\ne \\frac{4}{4x}"} displayMode/></h3>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Proofs</h2>
<h3 class="heading"> <Katex math={"\\log a^n = n\\log a"} displayMode/></h3>
<p><Katex math={"\\log_3 81"}/></p>
<p><Katex math={"= \\log_3 3^4"}/></p>
<p><Katex math={"=4\\log_3 3"}/></p>
<p><Katex math={"=4(1)"}/></p>
<p><Katex math={"=4"}/></p>
<p></p>
<p><Katex math={"3^x = 81"}/></p>
<p><Katex math={"\\therefore x = 4"}/></p>
<p></p>
<p></p>
<h3 class="heading"> <Katex math={"\\log a - \\log b = \\log \\frac{a}b"} displayMode/></h3>
<p><Katex math={"\\log 1000 - \\log 100"}/></p>
<p><Katex math={"= \\log \\frac{1000}{100}"}/></p>
<p><Katex math={"= \\log 10"}/></p>
<p><Katex math={"= 1"}/></p>
<p></p>
<p><Katex math={"\\log 10^3 - \\log 10^2"}/></p>
<p><Katex math={"=3\\log 10 - 2\\log 10"}/></p>
<p><Katex math={"= 1 \\log 10"}/></p>
<p><Katex math={"=1"}/></p>
</div>