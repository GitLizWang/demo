$(function(){
    $.post({
        url:'user/getAll',
        success:function (data){
            for (var i = 0; i < data.length; i++){
                var text = "<tr>\n" +
                    "            <th>1:</th>\n" +
                    "            <th>张三:</th>\n" +
                    "            <th>admin:</th>\n" +
                    "            <th>2020年11月二十六日13:35:00:</th>\n" +
                    "            <th>正常:</th>\n" +
                    "            <td>\n" +
                    "                <a href=\"#\" class=\"btn btn-danger\">删除</a>\n" +
                    "                <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "            </td>\n" +
                    "        </tr>"
                var text1 = "<tr>\n" +
                    "            <th>"+data[i].id+"</th>\n" +
                    "            <th>"+data[i].username+"</th>\n" +
                    "            <th>"+data[i].password+"</th>\n" +
                    "            <th>"+data[i].createtime+"</th>\n" +
                    "            <th>"+data[i].status+"</th>\n" +
                    "            <td>\n" +
                    "                <a href=\"user/delById?id="+data[i].id+"\" class=\"btn btn-danger\">删除</a>\n" +
                    "                <a href=\"#\" class=\"btn btn-success\">修改</a>\n" +
                    "            </td>\n" +
                    "        </tr>"
                var obj = $(".pool1");
                obj.append(text1)
            }
        }
    });
});