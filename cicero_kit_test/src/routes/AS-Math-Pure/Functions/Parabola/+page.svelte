<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Parabola</title></svelte:head><div class="note">
   <h1 class="title">Parabola</h1>
<h2 class="heading"> <Katex math={" y = ax^2 + bx + c"} displayMode/></h2>
<h2 class="heading"> <Katex math={"y = a(x - b)(x - c) "} displayMode/></h2>
<h2 class="heading"> <Katex math={" y = a(x-p)^2 + q"} displayMode/></h2>
<p></p>
<p></p>
<img src="/Attachements/Pastedimage20230805141125.png" alt="diagram">
<p></p>
<img src="/Attachements/Pastedimage20230805141223.png" alt="diagram">
<p>When a = 1 or -1 the graph can be sketched from the turning point by going:</p>
<p></p>
<p>- out 1 up 1</p>
<p>- out 2 up 4</p>
<p>- out 3 up 9</p>
<p></p>
<p><i>note that the y-value graphed is is x value squared</i></p>
<p></p>
<h2 class="heading"> Transformations</h2>
<p><Katex math={" y = a(x-p)^2 + q"} displayMode/></p>
<p><Katex math={"p"}/> - left/right transformation (inverted)</p>
<p><Katex math={"q"}/> - up/down transformation</p>
<p></p>
<p></p>
<h3 class="heading"> <mark class="hltr-blue">Vertical</mark></h3>
<p></p>
<p><Katex math={"f(x) = x^2 - 2x+1"}/></p>
<p></p>
<p><Katex math={"\\begin{bmatrix} 0 \\\\ 4 \\\\ \\end{bmatrix}"}/></p>
<p></p>
<p><Katex math={"f(x) + 4 = (x^2 -2x + 1) + 4"}/></p>
<p></p>
<p><Katex math={"= x^2 -2x + 5"}/></p>
<p></p>
<p></p>
<p><Katex math={"g(x) = 3(x-5)^2 + 1"}/></p>
<p></p>
<p><Katex math={"g(x) + 4 = 3(x-5)^2 + 1 + 4"}/></p>
<p></p>
<p><Katex math={"= 3(x-5)^2 + 5"}/></p>
<p></p>
<p></p>
<h2 class="heading"> <mark class="hltr-cyan">Horizontal</mark></h2>
<p></p>
<p><Katex math={"f(x) = x^2-2x+1"}/></p>
<p></p>
<p><Katex math={"f(x + 3) = (x+3)^2 - 2(x+3)+1"}/></p>
<p></p>
<p><Katex math={"f(x+3)"}/> - Backwards / will move graph 3 left</p>
<p></p>
<p><Katex math={"= x^2 + 6x + 9 - 2x-6+1"}/></p>
<p></p>
<p><Katex math={"= x^2 + 4x + 4"}/></p>
</div>