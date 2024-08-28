<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Remainder-Theorem</title></svelte:head><div class="note">
   <h1 class="title">Remainder Theorem</h1>
<h2 class="heading"> <Katex math={"f(x) \\div (ax+b) = (ax+b) * Q(x) + R"} displayMode/></h2>
<h2 class="heading"> <Katex math={"f(-\\frac{b}a) = (a(-\\frac{b}a) + b) * Q(x) + R"} displayMode/></h2>
<h2 class="heading"> <Katex math={" = 0 * Q(x) + R"} displayMode/></h2>
<h2 class="heading"> <Katex math={" = R"} displayMode/></h2>
</div>