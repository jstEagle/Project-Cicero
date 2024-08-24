<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Absolute-Value-Equations</title></svelte:head><div class="note">
   <h1 class="title">Absolute-Value-Equations</h1>
<p>The modulus (also known as absolute) value function is written as <Katex math={"|x|"}/> and it is defined as <Katex math={"|x| = \\begin{Bmatrix} -x, \\ if\\ x \\le 0 \\\\ x, \\ if\\ x \\ge 0 \\end{Bmatrix}"}/></p>
<p>You can also write <Katex math={"|a| = |b| \\leftarrow \\rightarrow a^2 = b^2"}/>, because the quadratic power will make any negative positive and then you take the surd and the function becomes the original function.</p>
<p></p>
<p>The absolute value graph is essentially just a graph with all the parts that are negative (below the y-axis) reflected across the x-axis to be positive.</p>
<p></p>
<img src="/graphs/AbsoluteValueEquations0.png" alt="graph">
<p><Katex math={"y = |x|"}/> - Solid</p>
<p><Katex math={"y = |x-3|+5"}/> - Dotted</p>
<p></p>
<p></p>
<p>The absolute value of a number is its magnitude without any direction. i.e. the distance from (0,0)</p>
<p></p>
<p><Katex math={"|3| = 3"} displayMode/></p>
<p><Katex math={"|-3| = 3"} displayMode/></p>
<p>_Operates as a bracket_</p>
<h2 class="heading"> <Katex math={" y = |x^2 - 2|"} displayMode/></h2>
<img src="/graphs/AbsoluteValueEquations1.png" alt="graph">
<p>_<Katex math={"y = x^2 -2"}/> : Dotted_</p>
<h2 class="heading"> Example</h2>
<p><Katex math={"|x-3|\\ if\\ x=1"} displayMode/></p>
<p><Katex math={"|(1)-3| = 2"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"|2x-1| = 7"} displayMode/></p>
<p><Katex math={"2x-1 = 7\\ or\\ 2x-1 = -7"} displayMode/></p>
<p><Katex math={"x = 4\\ or\\ x = -3"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={"y = \\sin{|x|}\\ \\  x \\epsilon[-2\\pi,2\\pi]"} displayMode/></h2>
<img src="/graphs/AbsoluteValueEquations2.png" alt="graph">
<p>The function <Katex math={"\\sin(|x|)"}/> is a modification of the sine function <Katex math={"sin(x)"}/> where the absolute value of <Katex math={"x"}/> is taken. The absolute value function <Katex math={"|x|"}/> essentially removes the negative sign from <Katex math={"x"}/>, making all values positive. </p>
<p></p>
<p>In the context of <Katex math={"sin(|x|)"}/>, this means that the function is symmetric with respect to the y-axis. The graph of <Katex math={"\\sin(|x|)"}/> will look the same for positive and negative values of <Katex math={"x"}/>.</p>
<p></p>
<p>Here's a brief explanation:</p>
<p></p>
<p>1. For <Katex math={"x \\ge 0 : \\sin(|x|) = \\sin(x)"}/></p>
<p>2. For <Katex math={"x < 0: \\sin(|x|) = \\sin(-x) = -\\sin(x)"}/></p>
<p></p>
<p>So, the graph of <Katex math={"\\sin(|x|)"}/> will have the same shape as <Katex math={"\\sin(x)"}/>, but it will be reflected in the y-axis for negative values of <Katex math={"x"}/>. The absolute value essentially "flips" the negative part of the graph to the positive side.</p>
<p></p>
<p>The sine function has a periodic nature, and the absolute value won't change the periodicity or the general shape of the sine curve, but it will affect its symmetry.</p>
<h2 class="heading"> <Katex math={" y = \\cos{|x|}\\ \\ x \\epsilon[-2\\pi, 2\\pi]"} displayMode/></h2>
<img src="/graphs/AbsoluteValueEquations3.png" alt="graph">
<p></p>
<h2 class="heading"> <Katex math={"y = \\tan{|x|} \\ \\ x \\epsilon[-2\\pi, 2\\pi]"} displayMode/></h2>
<img src="/graphs/AbsoluteValueEquations4.png" alt="graph">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> <Katex math={" y = |x-2|\\ and\\ y = ||x|-2|"} displayMode/></h2>
<img src="/graphs/AbsoluteValueEquations5.png" alt="graph">
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Solving Absolute Value Equations</h2>
<h4 class="heading"> Method 1</h4>
<p><Katex math={" |x-5| = 2x-7"} displayMode/></p>
<p><Katex math={"If\\ x-5 \\ge 0"} displayMode/></p>
<p><Katex math={"Then\\ x \\ge 5"} displayMode/></p>
<p><Katex math={" \\downarrow"} displayMode/></p>
<p><Katex math={"x-5 = 2x-7"} displayMode/></p>
<p><Katex math={"-5+7 = 2x-x"} displayMode/></p>
<p><Katex math={"x= 2"} displayMode/></p>
<p><Katex math={"\\therefore there\\ is\\ no\\ sol.\\ for\\ x-5 \\ge 0"} displayMode/></p>
<p><Katex math={"If\\ \\ x - 5 \\le 0"} displayMode/></p>
<p><Katex math={"Then\\ x \\le 5"} displayMode/></p>
<p><Katex math={"-(x-5) = 2x+7"} displayMode/></p>
<p><Katex math={"-x+5 = 2x-7"} displayMode/></p>
<p><Katex math={"12 = 3x"} displayMode/></p>
<p><Katex math={"x = 4"} displayMode/></p>
<img src="/graphs/AbsoluteValueEquations6.png" alt="graph">
<h4 class="heading"> Method 2</h4>
<p><Katex math={"|x-3| = |x-5|"} displayMode/></p>
<p><Katex math={"(|x-3|)^2 = (|x-5|)^2"} displayMode/></p>
<p><Katex math={"(x-3)^2 - (x-5)^2 = 0"} displayMode/></p>
<p><Katex math={"((x-3)+(x-5))((x-3)-(x-5))= 0"} displayMode/></p>
<p><Katex math={"(2x-8)2=0"} displayMode/></p>
<p><Katex math={"2x - 8 = 0"} displayMode/></p>
<p><Katex math={"x = 4"} displayMode/></p>
<p><Katex math={"\\downarrow Check"} displayMode/></p>
<p><Katex math={"|4-3| = |4-5|"} displayMode/></p>
<p><Katex math={"|1| = |-1|"} displayMode/></p>
<p><Katex math={"1 = 1"} displayMode/></p>
<p><Katex math={"\\therefore x=4\\ is\\ valid"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h3 class="heading"> Drawing Graphs</h3>
<p><Katex math={" y = |x-3| + 2x+1"} displayMode/></p>
<p><Katex math={"when\\ x-3\\ge 0 "} displayMode/></p>
<p><Katex math={"x \\ge 3"} displayMode/></p>
<p><Katex math={"so\\ for\\ x\\epsilon [3, \\infty)"} displayMode/></p>
<p><Katex math={"y = x-3 + 2x+1"} displayMode/></p>
<p><Katex math={"y = 3x-2"} displayMode/></p>
<p><Katex math={" \\\\\\ "} displayMode/></p>
<p><Katex math={"when\\ x-3 \\le 0"} displayMode/></p>
<p><Katex math={"x \\le 3"} displayMode/></p>
<p><Katex math={"so\\ for\\ x\\epsilon (-\\infty, 3]"} displayMode/></p>
<p><Katex math={"y = -(x-3)+2x+1"} displayMode/></p>
<p><Katex math={"= -x+3+2x+1"} displayMode/></p>
<p><Katex math={"= x+4"} displayMode/></p>
<img src="/graphs/AbsoluteValueEquations7.png" alt="graph">
<p></p>
<p><Katex math={" y = |x-5|-|x+2|"} displayMode/></p>
</div>