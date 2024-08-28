<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Combinations</title></svelte:head><div class="note">
   <h1 class="title">Combinations</h1>
<p>Combinations are a fundamental concept in combinatorics, a branch of mathematics that deals with counting and arranging objects without regard to their order. Combinations are often denoted as "n choose k" and are used to calculate the number of ways to select k objects from a set of n distinct objects without replacement.</p>
<p></p>
<h1 class="heading"> Notation</h1>
<p></p>
<p>The notation for combinations is typically expressed as:</p>
<p></p>
<p><Katex math={"C(n, k) = \\binom{n}{k}"}/></p>
<p></p>
<p>Here, <Katex math={"n"}/> represents the total number of objects to choose from, and <Katex math={"k"}/> represents the number of objects to be chosen. The expression <Katex math={"\\binom{n}{k}"}/> reads as "n choose k" or "n over k."</p>
<p></p>
<h1 class="heading"> Formula for Combinations</h1>
<p></p>
<p>The formula to calculate combinations is as follows:</p>
<p></p>
<p><Katex math={"\\binom{n}{k} = \\frac{n!}{k!(n - k)!}"}/></p>
<p></p>
<p>Where:</p>
<p>- <Katex math={"n!"}/> (n factorial) represents the product of all positive integers from 1 to n.</p>
<p>- <Katex math={"k!"}/> (k factorial) represents the product of all positive integers from 1 to k.</p>
<p>- <Katex math={"(n - k)!"}/> represents the product of all positive integers from 1 to (n - k).</p>
<p></p>
<h1 class="heading"> Example</h1>
<p></p>
<p>Let's say you have a set of 5 different colors, and you want to choose 2 of them for a painting. You can calculate the number of different combinations using the combination formula:</p>
<p></p>
<p><Katex math={"\\binom{5}{2} = \\frac{5!}{2!(5 - 2)!} = \\frac{5 . 4}{2 . 1} = 10"}/></p>
<p></p>
<p>So, there are 10 different combinations of 2 colors you can choose from the set of 5.</p>
<p></p>
<h1 class="heading"> Properties of Combinations</h1>
<p></p>
<h2 class="heading"> 1. Symmetry Property</h2>
<p></p>
<p>Combinations exhibit symmetry, meaning that <Katex math={"\\binom{n}{k} = \\binom{n}{n - k}"}/>. This property reflects the fact that choosing k objects from n is equivalent to choosing (n - k) objects not to include.</p>
<p></p>
<h2 class="heading"> 2. Zero Combinations</h2>
<p></p>
<p>If k is greater than n (i.e., if you want to choose more objects than are available), <Katex math={"\\binom{n}{k}"}/> is equal to 0.</p>
<p></p>
<h2 class="heading"> 3. Combinations with Repetition</h2>
<p></p>
<p>In some cases, you may want to calculate combinations with repetition, where the same object can be chosen multiple times. The formula for combinations with repetition is:</p>
<p></p>
<p><Katex math={"\\binom{n + k - 1}{k}"}/></p>
<p></p>
<h1 class="heading"> Applications</h1>
<p></p>
<p>Combinations have various applications in mathematics and real-world problems, including:</p>
<p></p>
<p>- Combinatorial problems in probability theory.</p>
<p>- Calculating the number of ways to form committees or teams.</p>
<p>- Solving problems related to permutations, where order does matter.</p>
<p>- Counting possibilities in various games and puzzles.</p>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example 1: Combinations of Playing Cards</h2>
<p></p>
<p>Suppose you have a standard deck of 52 playing cards, and you want to find the number of ways to choose 5 cards from the deck for a poker hand. We can use the combination formula:</p>
<p></p>
<p><Katex math={"\\binom{52}{5} = \\frac{52!}{5!(52 - 5)!}"}/></p>
<p></p>
<p>Calculating this:</p>
<p></p>
<p><Katex math={"\\binom{52}{5} = \\frac{52!}{5! . 47!}"}/></p>
<p></p>
<p>Now, calculate the factorials:</p>
<p></p>
<p><Katex math={"52! = 52 . 51 . 50 . 49 . 48 . \\dots . 3 . 2 . 1"}/></p>
<p><Katex math={"5! = 5 . 4 . 3 . 2 . 1 "}/></p>
<p><Katex math={"47! = 47 . 46 . 45 . "}/></p>
<p><Katex math={"\\dots . 3 . 2 . 1 "}/></p>
<p></p>
<p>Now, plug these values into the combination formula:</p>
<p></p>
<p><Katex math={"\\binom{52}{5} = \\frac{52 . 51 . 50 . 49 . 48 . \\dots . 3 . 2 . 1}{(5 . 4 . 3 . 2 . 1) . (47 . 46 . 45 . \\dots . 3 . 2 . 1)} \\\\ = \\frac{52 . 51 . 50 . 49 . 48}{5 . 4 . 3 . 2 . 1} \\\\ = 2,598,960"}/></p>
<p></p>
<p>So, there are 2,598,960 different combinations of choosing 5 cards from a standard deck of 52 cards for a poker hand.</p>
<p></p>
<h2 class="heading"> Example 2: Choosing Donuts</h2>
<p></p>
<p>Imagine you have 8 different types of donuts at a bakery, and you want to select 3 donuts to create a custom box of donuts. How many different combinations of donuts can you choose?</p>
<p></p>
<p>Using the combination formula:</p>
<p></p>
<p><Katex math={"\\binom{8}{3} = \\frac{8!}{3!(8 - 3)!}"}/></p>
<p></p>
<p>Calculate the factorials:</p>
<p></p>
<p><Katex math={"8! = 8 . 7 . 6 . 5 . 4 . 3 . 2 . 1 \\\\3! = 3 . 2 . 1 \\\\(8 - 3)! = 5! = 5 . 4 . 3 . 2 . 1"}/></p>
<p></p>
<p>Now, plug these values into the combination formula:</p>
<p></p>
<p><Katex math={"\\binom{8}{3} = \\frac{8!}{3! . 5!} \\\\ = \\frac{8 . 7 . 6}{3 . 2 . 1} \\\\= 56"}/></p>
<p></p>
<p>So, there are 56 different combinations of choosing 3 donuts from 8 different types at the bakery to create a custom box of donuts.</p>
</div>