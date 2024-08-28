<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>TypeIandTypeIIerrors</title></svelte:head><div class="note">
   <h1 class="title">Type I and Type II errors</h1>
<p></p>
<h6 class="heading">|      | Decision       | Decision         | Decision         |</h6>
<p>| -------------- | -------------- | ---------------- | ---------------- |</p>
<h6 class="heading">| True Situation |         | Accept <Katex math={"H<i>0"}/>     | Reject <Katex math={"H</i>0"}/>     |</h6>
<p>| True Situation | <Katex math={"H_0"}/> is true  | Correct decision | Type I error     |</p>
<p>| True Situation | <Katex math={"H_0"}/> is false | Type II error    | Correct decision |</p>
<p></p>
<h2 class="heading"> Type 1 error</h2>
<p>You have rejected the null hypothesis even though the null hypothesis was correct</p>
<p></p>
<p><Katex math={"p(Type\\ 1) = p(critical\\ val)"} displayMode/></p>
<h2 class="heading"> Type 2 error</h2>
<p>You have accepted the </p>
</div>