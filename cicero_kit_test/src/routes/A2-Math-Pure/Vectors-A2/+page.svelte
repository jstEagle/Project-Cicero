<script>
    import Katex from '$lib/Katex.svelte';
    import '$lib/global.css'
</script>

<svelte:head><title>Vectors-A2</title></svelte:head><div class="note">
   <h1 class="title">Vectors-A2</h1>
<h4 class="heading"> Vector - magnitude and direction</h4>
<h4 class="heading"> Scalar - magnitude only</h4>
<p></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<img src="/Attachements/Pastedimage20240819094522.png" alt="diagram">
<h2 class="heading"> <Katex math={"\\tilde{a} =\\begin{pmatrix} x \\\\ y \\\\ z \\end{pmatrix}\\rightarrow \\text{ column vector}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\tilde{a} = xi+yj+zk\\rightarrow \\text{component vector}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"|\\tilde{a}| = \\sqrt{x^2 + y^2 + z^2}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Vector calculations</h2>
<p><Katex math={"\\tilde{a} = \\begin{pmatrix}x\\\\ y\\\\ z\\end{pmatrix}\\quad \\tilde{b}=\\begin{pmatrix}u\\\\ v\\\\ w\\end{pmatrix}"} displayMode/></p>
<p><Katex math={"\\tilde{a} \\pm \\tilde{b} = \\begin{pmatrix}x\\pm u\\\\ y\\pm v\\\\ z\\pm w\\end{pmatrix}=(x\\pm u)i + (y\\pm v)j + (z\\pm w)k"} displayMode/></p>
<p><Katex math={"M\\tilde{a}=\\begin{pmatrix}Mx\\\\ My \\\\ Mz\\end{pmatrix} = Mxi + Myi + Mzk"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Unit vector</h2>
<h2 class="heading"> <Katex math={"\\hat{a} = \\text{symbol of unit vector}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\tilde{a} = \\begin{pmatrix}i\\\\ j\\\\ k\\end{pmatrix} \\quad \\hat{a}=\\frac{\\tilde{a}}{|\\tilde{a}|}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Angle between two vectors</h2>
<div class="link-container"><a href="/A2-Math-Pure/Dot-Product">Dot Product</a></div>
<h2 class="heading"> <Katex math={"\\cos\\theta = \\frac{a.b}{|a||b|} \\quad a=\\begin{pmatrix} a_1\\\\ a_2\\\\ a_3\\end{pmatrix}\\quad b=\\begin{pmatrix} b_1\\\\ b_2\\\\ b_3\\end{pmatrix}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"a.b = \\text{ dot product of a and b}"} displayMode/></h2>
<img src="/Attachements/Pastedimage20240819100842.png" alt="diagram">
<p>Since <Katex math={"\\cos(90^o) = 0"}/>, it follows that is vector <Katex math={"a"}/> and <Katex math={"b"}/> are perpendicular then <Katex math={"a.b=0"}/></p>
<p><Katex math={"\\cos\\theta = \\frac{a.b}{|a||b|} \\quad 0=\\frac{a.b}{|a||b|}"} displayMode/></p>
<p><Katex math={"\\therefore ab = 0"} displayMode/></p>
<p><Katex math={"\\therefore a_1b_1+a_2b_2 = 0 \\text{ if }\\perp"} displayMode/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Check if lines are parallel or intersect or skew</h2>
<h2 class="heading"> <Katex math={"L_1 : r_1 = a_1 + td_1\\quad L_2:r_2 = a_2 + sd_2"} displayMode/></h2>
<h2 class="heading"> <Katex math={"n = d_1 \\times d_2\\quad \\text{cross product}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"d = \\frac{|(a_2-a_1).n|}{|n|} \\quad \\text{shortest distance}"} displayMode/></h2>
<p>- <b>Parallel:</b> if <Katex math={"n = 0"}/></p>
<p>- <b>Intersecting:</b> if <Katex math={"d=0"}/> and <Katex math={"n\\ne 0"}/></p>
<p>- <b>Skew:</b> if <Katex math={"d\\ne 0"}/></p>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Shortest distance between point <Katex math={"p"}/> and a line</h2>
<p>Let <Katex math={"A"}/> be any point on the line</p>
<h2 class="heading"> <Katex math={"AP = P-A"} displayMode/></h2>
<h2 class="heading"> <Katex math={"|AP\\times d| \\quad \\text{magnitude of cross product}"} displayMode/></h2>
<h2 class="heading"> <Katex math={"d=\\frac{|AP\\times d|}{|d|}\\quad \\text{ shortest distance}"} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
<h2 class="heading"> Angle between two lines</h2>
<p><b>The angle between two lines is the same as the angle between their direction vectors (obviously)</b></p>
<h2 class="heading"> <Katex math={"L_1 : r_1 = a_1 + td_1\\quad L_2:r_2 = a_2 + sd_2"} displayMode/></h2>
<h2 class="heading"> <Katex math={"\\cos\\theta = \\frac{d_1.d_2}{|d_1||d_2|} "} displayMode/></h2>
<h3 class="divider">Made by jstEagle ;)</h3>
</div>