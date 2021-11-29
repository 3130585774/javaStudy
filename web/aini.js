const colors = ["#e03776","#8f3e98","#4687bf","#3bab6f","#f9c25e","#f47274"];
const SVG_NS ='http://www.w3.org/2000/svg'
const SVG_XLINK ="http://www.w3.org/1999/xlink";
let heartsRy = []
function useTheHeart(n){
	let use = document.createElementNS(SVG_NS,'use');
	use.n = n;
	use.setAttributeNS(SVG_XLINK,'xlink:href','#heart');
	use.setAttributeNS(null,'transform',`scale(${use.n})`);
	use.setAttributeNS(null,'fill',colors[n%colors.length]);
	use.setAttributeNS(null,'x',-69);
	use.setAttributeNS(null,'y',-69);
	use.setAttributeNS(null,'width',138);
	use.setAttributeNS(null,'height',138);
	heartsRy.push(use)
	hearts.appendChild(use);
}
for(let n = 18;n>=0;n--){useTheHeart(n)}

function Frame(){
	window.requestAnimationFrame(frame);
	for(let i = 0;i<heartsRy.length; i++){
		if(heartsRy[i].n<18){heartsRy[i].n +=0.1
		}else{
		heartsRy[i].n = 0;
		hearts.appendChild(heartsRy[i])
		}
		heartsRy[i].setAttributeNS(null,'transform',`scale(${heartsRy[i].n})`);
	}
}
Frame()