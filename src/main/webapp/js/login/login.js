/**
 * Created by lxl on 2017/2/13.
 */
$("form").submit(function(){
    var user = {} ;
    user.username = $("#username").val() ;
    user.password = $("#password").val() ;
    user.remember = true ;

    $.post("/login", user, function (data) {
        if (data.success) {
            alert("添加成功！");
        }else{
            alert(data.error) ;
        }
    }) ;

    return false ;
}) ;