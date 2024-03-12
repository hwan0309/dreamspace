$(function(){
    $("#submit").click(function(){
        //e.preventDefault();
        //let rv = true;
        if($(#username)).val()==""){
            alert("u name");
            $("#username").focus();
            return false;
        }
        $("#loginform").submit();
    });
    $("#talk").on("keyup", function(e)){
        if(e.keyCode == 13){

        }
    };
});