document.addEventListener("DOMContentLoaded", function () {
    var banner = document.getElementById("banner");
    var menuBanner = document.getElementById("menuBanner");
    var menuDetails = document.getElementById("menuDetails");

    menuBanner.addEventListener("click", function () {
        if (menuDetails.style.display === "none") {
            menuDetails.style.display = "block";
            banner.scrollIntoView({ behavior: "smooth" });
        } else {
            menuDetails.style.display = "none";
        }
    });
});
