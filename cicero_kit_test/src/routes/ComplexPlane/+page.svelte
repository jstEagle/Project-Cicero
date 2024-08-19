<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>ComplexPlane</title></svelte:head><div class="note">
   <h1 class="title">ComplexPlane</h1>
<p>All real numbers are represented by points on the x-axis which is therefore called the <b>real axis</b>. Pure imaginary numbers are represented as points on the y-axis which is called the <b>imaginary-axis</b>.</p>
<p>These are labelled <b>RE</b> and <b>IM</b> respectively.</p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p><Katex math={"z = 2 + 3i"} displayMode/></p>
<p><Katex math={"w = -3-4i"} displayMode/></p>
<p><Katex math={"u=2i"} displayMode/></p>
<p><Katex math={"v=7"} displayMode/></p>
<h4 class="heading"> Describing the transformation that maps <Katex math={"z\\rightarrow -z"}/> = Rotation 180<Katex math={"^o"}/></h4>
<h4 class="heading"> Describing the transformation that maps <Katex math={"z\\rightarrow z^*"}/> = Reflection across real axis</h4>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h4 class="heading"> Position vectors</h4>
<p><Katex math={"z-w^* "} displayMode/></p>
<p><Katex math={"\\binom{2}{3} - \\binom{-5}{4} = \\binom{5}{-1} = 5-i"} displayMode/></p>
<p><Katex math={" "} displayMode/></p>
<p><Katex math={"z + v "} displayMode/></p>
<p><Katex math={"\\binom23 + \\binom70 = \\binom93 = 9+3i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h4 class="heading"> Modulus of a complex number where z = x + iy</h4>
<h4 class="heading"> <Katex math={"|z| = \\sqrt{x^2 + y^2}"} displayMode/></h4>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Example</h2>
<p><Katex math={"z = 3+4i"} displayMode/></p>
<p><Katex math={"w = 3-i"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"|\\frac{z}{w}|"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\frac{3+4i}{3-i} * \\frac{3+i}{3+i} = \\frac{5+15i}{10} = \\frac12 + \\frac32i"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\sqrt{(\\frac12)^2 + (\\frac32)^2} = \\frac{\\sqrt{10}}{2}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"|zw|"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"(3+4i)(3-i) = 13+9i"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\sqrt{(13)^2 + (9)^2}= 5\\sqrt{10}"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<p><Katex math={"|z+w|"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"z + w = 6+3i"} displayMode/></p>
<p><Katex math={"\\downarrow"} displayMode/></p>
<p><Katex math={"\\sqrt{(6)^2 + (3)^2} = 3\\sqrt5"} displayMode/></p>
</div>