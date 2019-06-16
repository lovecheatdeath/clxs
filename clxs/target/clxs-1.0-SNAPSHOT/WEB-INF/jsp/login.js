$('#a').click(function () {
    alert('sdadsad')
    var name = $("input[name='username']").val();
    var password = $("input[name='password']").val();
    var data = {
        'username':name,
        'password':password,
    };
    // var contextPath = $('#contextPath').attr('href');
    console.log(data);
    $.ajax({
        url: "/doLogin",
        type: "POST",
        data: data,
        success: function(res){
            console.log(res);
            if(res.code == 100){
                layer.open({
                    content: res.extend.end,
                    yes: function(index, layero){
                        layer.close(index); //如果设定了yes回调，需进行手工关闭
                        location.href="/login";
                    }
                });
            }else{
                layer.msg(res.extend.end);
            }
        },
        error: function(XMLHttpRequest, textStatus, errorThrown) {
            console.log(XMLHttpRequest);
        }
    });

})
