function rcs(n) {
    const com = Math.floor(Math.random()*3);
    let rc= ["가위", "바위",  "보"];
    let ps = ["-135px -108px", "-70px -6px", "-7px -108px"];



    document.getElementById("rcs-me-txt").innerHTML = rc[n];
    document.getElementById("rcs-com-txt").innerHTML = rc[com];
    document.getElementById("rcs-me").style.backgroundPosition = ps[n];
    document.getElementById("rcs-com").style.backgroundPosition = ps[com];

}