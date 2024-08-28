<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Probability</title></svelte:head><div class="note">
   <h1 class="title">Probability</h1>
<h4 class="heading"> Proving independence</h4>
<p><Katex math={" p(R \\cap F) = p(p(R) * p(F))"} displayMode/></p>
<p></p>
<h4 class="heading"> Probability interaction</h4>
<p>One event <i></i>or<i></i> Other event - <Katex math={"p(1) + p(2)"}/></p>
<p></p>
<p>One event <i></i>and<i></i> Other event - <Katex math={"p(1) * p(2)"}/></p>
<p></p>
<p></p>
<h4 class="heading"> Probability of one event given that another event has occurred</h4>
<h4 class="heading"> <Katex math={" p(A / B) - Probability\\ of\\ A\\ if\\ B\\ has\\ occured"} displayMode/></h4>
<h4 class="heading"> <Katex math={" \\downarrow"} displayMode/></h4>
<h4 class="heading"> <Katex math={"p(A/B) = \\frac{p(A\\cap B)}{p(B)}"} displayMode/></h4>
<p></p>
</div>