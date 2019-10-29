var tbody0="";
//定义网多的代码
function funCalendarSelectAll(){
    $.ajax({
        url:'../calendarSelectAll',
        data:"np=1",
        timeout:10000,
        type:"get",
        dataType:"json",
        success:function(msg){
            //msg->return json
            //控制台可以输出内容
            //console.log(msg);
            tbody0="";
            for (var index = 0; index < msg.length; index++) {
                tbody0+="<tr class='success'>";
                tbody0+="<td>"+msg[index].title+"</td>";
                tbody0+="<td>"+msg[index].content+"</td>";
                tbody0+="<td>"+msg[index].ifOK+"</td>";    
                tbody0+="<td>"+msg[index].finishDate+"</td>";   
                tbody0+="<td><a href='javascript:void(0)' onclick=funCalendarUpdate("+msg[index].id+",'"+msg[index].title+"',"+msg[index].importance+",'"+encodeURIComponent(msg[index].finishDate)+"')>更新</a></td>"; 
                tbody0+="<td><a href='javascript:void(0)' onclick=funCalendarDelete("+msg[index].id+")>删除</a></td>";                   
                tbody0+="</tr>";         
            }
            $("#tbody0").html(tbody0);
        },
        error:function(msg){

        }
    });    
}
function funCalendarDelete(id){
    //增加一个判断
    if (window.confirm("您确认?")) {
        $.ajax({
            url:'../calendarDelete',
            data:"id="+id,
            timeout:10000,
            type:"get",
            success:function(msg){
                //msg->return json
                //控制台可以输出内容
                //console.log(msg);
                if (msg==1) {
                    window.alert("删除成功");
                    funCalendarSelectAll();
                  } else {
                      
                  }            
            },
            error:function(msg){
    
            }
        });     
           
    } else {
        
    }
}
//更新
function funCalendarUpdate(id,title,importance,finishdate){
    $("#title").val(title);
    $("#importance").val(importance);
    //decodeURIComponent 解析代码
    $("#finishDate").val(decodeURIComponent(finishdate));
    $("#id").val(id);
    $("#btnCalendarUpdate").show();
    $("#btnCalendarInsert").hide();
}
function funInit(){
    //隐藏更新的按钮
    $("#btnCalendarUpdate").hide();
}
$(document).ready(function(){
    //初始化
    funInit();
    //网多
    funCalendarSelectAll();
    //网增
    $("#frmCalendar").submit(function(){
        $.ajax({
            url:'../calendarInsert',
            data:$("#frmCalendar").serialize(),
            timeout:10000,
            type:"post",
            success:function(msg){
                if (msg==1) {
                  window.alert("增加成功");
                  funCalendarSelectAll();
                } else {
                    
                }
            },
            error:function(msg){

            }
        });
        return false; //submit
    });
    //网改
    $("#btnCalendarUpdate").click(function(){
        $.ajax({
            url:'../calendarUpdate',
            data:$("#frmCalendar").serialize(),
            timeout:10000,
            type:"post",
            success:function(msg){
                if (msg==1) {
                  window.alert("网改成功");
                  funCalendarSelectAll();
                } else {
                    
                }
            },
            error:function(msg){

            }
        });        
    });
});
