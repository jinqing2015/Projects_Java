<p>
<meta content="text/html; charset="gbk" http-equiv="Content-Type" /><style type="text/css">
 
* { margin:0; padding:0;} 
ul, li { list-style:none;} 
body{ 
text-align:center; 
} 
#play{ 
width:330px; 
height:250px; 
position:absolute; 
left:34%; 
top:19%; 
margin:-300x 0 0 0px; 
overflow:hidden; 
} 
#playimg{ 
width:330px; 
height:250px; 
position:absolute; 
} 
#playimg li{ 
height:250px;
width:330px 
overflow:hidden; 
} 
#playimg img{ 
width:350px; 
height:250px; 
} 
#playbtn{ 
position:absolute; 
left:0; 
bottom:5px; 
} 
#playbtn li{ 
display:inline; 
background:#eee; 
padding:2px 5px; 
margin:0 3px; 
cursor:pointer; 
} 
#playbtn .current{ 
background:gray; 
} </style></p>
<script type="text/javascript"> 
function $(id){return document.getElementById(id)} 
function moveElement(elementID,final_x,final_y,interval) {//这个方法在DOM艺术那个书上讲的很清楚 
if (!document.getElementById) return false; 
if (!document.getElementById(elementID)) return false; 
var elem = document.getElementById(elementID); 
if (elem.movement) { 
clearTimeout(elem.movement); 
} 
if (!elem.style.left) { 
elem.style.left = "0px"; 
} 
if (!elem.style.top) { 
elem.style.top = "0px"; 
} 
var xpos = parseInt(elem.style.left); 
var ypos = parseInt(elem.style.top); 
if (xpos == final_x && ypos == final_y) { 
return true; 
} 
if (xpos < final_x) { 
var dist = Math.ceil((final_x - xpos)/10); 
xpos = xpos + dist; 
} 
if (xpos > final_x) { 
var dist = Math.ceil((xpos - final_x)/10); 
xpos = xpos - dist; 
} 
if (ypos < final_y) { 
var dist = Math.ceil((final_y - ypos)/10); 
ypos = ypos + dist; 
} 
if (ypos > final_y) { 
var dist = Math.ceil((ypos - final_y)/10); 
ypos = ypos - dist; 
} 
elem.style.left = xpos + "px"; 
elem.style.top = ypos + "px"; 
var repeat = "moveElement('"+elementID+"',"+final_x+","+final_y+","+interval+")"; 
elem.movement = setTimeout(repeat,interval); 
} 
function imgChange(num){
if(!$('play')) return false; 
var piclist=$('playimg').getElementsByTagName('img'); 
var imgheight=piclist[0].offsetHeight; 
var moveY=-(imgheight*num); 
moveElement('playimg',0,moveY,5); 
} 
function classToggle(arr,n){
for(var i=0;i<arr.length;i++){ 
arr[i].className=''; 
} 
arr[n].className='current'; 
} 
function btnChange(btns){
if(!$(btns)) return false; 
$('play').onmouseover = function(){autokey = false}; 
$('play').onmouseout = function(){autokey = true}; 
var arr=$(btns).getElementsByTagName('li'); 
for(var i=0;i<arr.length;i++){ 
arr[i].index=i;
arr[i].onmouseover=function(){ 
//var num=index(this,arr); 
classToggle(arr,this.index); 
imgChange(this.index); 
} 
} 
} 
function autoChange(btns){ 
if(!$(btns)) return false; 
if(!autokey) return false; 
var arr=$(btns).getElementsByTagName('li'); 
for(var i=0;i<arr.length;i++){ 
if(arr[i].className=='current'){ 
var n=i+1; 
} 
} 
if(n>=arr.length) n=0; 
classToggle(arr,n); 
imgChange(n); 
} 
var autokey = true; 
setInterval("autoChange('playbtn')",3000); 
window.onload=function(){ 
btnChange('playbtn'); 
} 
</script>
<div id="play">
<ul id="playimg">
    <li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=34" style="border: 0px"><img  alt="" src="${pageContext.request.contextPath}/onlineshopping_jsp/product/picture1.jpg" /></a></li>
    <li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=36" style="border: 0px"><img  alt="" src="${pageContext.request.contextPath}/onlineshopping_jsp/product/picture2.jpg" /></a></li>
    <li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=12" style="border: 0px"><img  alt="" src="${pageContext.request.contextPath}/onlineshopping_jsp/product/picture3.jpg" /></a></li>
    <li><a href="${pageContext.request.contextPath}/onlineshopping_jsp/Detials.do?id=33" style="border: 0px"><img  alt="" src="${pageContext.request.contextPath}/onlineshopping_jsp/product/picture4.jpg" /></a></li>
</ul>
<ul id="playbtn">
    <li class="current">1</li>
    <li>2</li>
    <li>3</li>
    <li>4</li>
</ul>
</div>