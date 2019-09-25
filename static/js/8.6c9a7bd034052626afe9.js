webpackJsonp([8],{ClAQ:function(e,t,r){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var a=r("aozt"),n=r.n(a),i={name:"optionsformationSearch",data:function(){return{formItem:{ordernumber:"",departure:"",start:"",destination:"",dispatchedparty:"",gid:"",end:new Date,page:1},formRule:{},data:[]}},methods:{handleSubmit:function(e){var t=this;this.$refs[e].validate(function(e){e?t.$emit("handleOptionsSearch",t.formItem):t.$Message.error("请填写必填字段")})},startChange:function(e){var t=new Date(this.formItem.end);new Date(e)>t&&(this.formItem.start="")},endChange:function(e){var t=new Date(this.formItem.start);new Date(e)<t&&(this.formItem.end="")}},props:{ordernumbers:Array,goodsnames:Array}},o={render:function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",{staticClass:"search"},[r("Form",{ref:"formItem",attrs:{model:e.formItem,rules:e.formRule,"label-position":"left","label-width":60,inline:""}},[r("FormItem",{attrs:{label:"订单号",prop:"numberplate"}},[r("Select",{attrs:{filterable:"",clearable:""},model:{value:e.formItem.ordernumber,callback:function(t){e.$set(e.formItem,"ordernumber",t)},expression:"formItem.ordernumber"}},e._l(e.ordernumbers,function(t){return r("Option",{key:t.id,attrs:{value:t.ordernumber}},[e._v(e._s(t.ordernumber))])}))],1),e._v(" "),r("FormItem",{attrs:{label:"订单时间",prop:"start"}},[r("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},model:{value:e.formItem.start,callback:function(t){e.$set(e.formItem,"start",t)},expression:"formItem.start"}})],1),e._v(" "),r("FormItem",{attrs:{label:"~",prop:"end","label-width":30}},[r("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},model:{value:e.formItem.end,callback:function(t){e.$set(e.formItem,"end",t)},expression:"formItem.end"}})],1),e._v(" "),r("FormItem",{attrs:{label:"出发地",prop:"departure"}},[r("Input",{attrs:{placeholder:"出发地"},model:{value:e.formItem.departure,callback:function(t){e.$set(e.formItem,"departure",t)},expression:"formItem.departure"}})],1),e._v(" "),r("FormItem",{attrs:{label:"发运方",prop:"dispatchedparty","label-width":70}},[r("Input",{attrs:{placeholder:"发运方"},model:{value:e.formItem.dispatchedparty,callback:function(t){e.$set(e.formItem,"dispatchedparty",t)},expression:"formItem.dispatchedparty"}})],1),e._v(" "),r("FormItem",{attrs:{label:"到达地",prop:"destination"}},[r("Input",{attrs:{placeholder:"到达地"},model:{value:e.formItem.destination,callback:function(t){e.$set(e.formItem,"destination",t)},expression:"formItem.destination"}})],1),e._v(" "),r("FormItem",{attrs:{label:"货物名称",prop:"gid"}},[r("Select",{attrs:{filterable:"",clearable:""},model:{value:e.formItem.gid,callback:function(t){e.$set(e.formItem,"gid",t)},expression:"formItem.gid"}},e._l(e.goodsnames,function(t){return r("Option",{key:t.id,attrs:{value:t.id}},[e._v(e._s(t.goodsname))])}))],1),e._v(" "),r("FormItem",{staticStyle:{"margin-left":"-60px"}},[r("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formItem")}}},[e._v("查询")])],1)],1)],1)},staticRenderFns:[]};var l={name:"orderManagement",data:function(){var e=this;return{ruleValidate:{dispatchedparty:[{required:!0,message:"请输入发运方",trigger:"blur"}],carrier:[{required:!0,message:"请输入承运方",trigger:"blur"}],departure:[{required:!0,message:"请输入起运地",trigger:"blur"}],sendername:[{required:!0,message:"请输入发货人",trigger:"blur"}],sendertel:[{required:!0,validator:function(e,t,r){""===t?r(new Error("联系方式不可以为空")):/^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/.test(t)?r():r(new Error("联系方式格式不正确"))}}],destination:[{required:!0,message:"请输入到达地",trigger:"blur"}],receivername:[{required:!0,message:"请输入收货人",trigger:"blur"}],receivertel:[{required:!0,validator:function(e,t,r){""===t?r(new Error("联系方式不可以为空")):/^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/.test(t)?r():r(new Error("联系方式格式不正确"))},trigger:"blur"}],totaltraffic:[{required:!0,validator:function(t,r,a){console.log(e.temp.totaltraffic),""==e.temp.totaltraffic?a(new Error("请输入总量")):a()},trigger:"blur"}],gid:[{required:!0,message:"请选择货源信息",trigger:"change"}],time:[{required:!0,validator:function(t,r,a){""==e.temp.time?a(new Error("请选择时间")):a()}}]},showAdd:!0,deleteStatus:!1,query:{},datas:[],ordernumbers:[],goodsnames:[],href:"",dataId:"",dataTotal:0,searchItems:{},loading:!1,status:!1,temp:{id:"",dispatchedparty:"",carrier:"哪都通（大连）科技有限公司",departure:"",sendername:"",sendertel:"",destination:"",receivername:"",receivertel:"",gid:"",totaltraffic:0,volume:"",time:""},titles:[{type:"selection",align:"center",width:50,fixed:"left"},{title:"序号",key:"sequence",width:70,fixed:"left",align:"center",render:function(e,t){return e("div",[e("span",{props:{type:"primary",size:"small"},style:{marginRight:"5px"}},t.index+1)])}},{title:"订单号",key:"ordernumber",align:"center",width:220,fixed:"left"},{title:"承运方",key:"carrier",align:"center",width:200},{title:"发运方",key:"dispatchedparty",align:"center",width:210},{title:"起运地",key:"departure",align:"center",width:210},{title:"发货人",key:"sendername",align:"center",width:130},{title:"联系方式",key:"sendertel",align:"center",width:180},{title:"到达地",key:"destination",align:"center",width:220},{title:"收货人",key:"receivername",align:"center",width:130},{title:"联系方式",key:"receivertel",align:"center",width:180},{title:"总量",key:"totaltraffic",align:"center",width:180,render:function(e,t){var r=t.row.totaltraffic.toString();return-1==r.indexOf(".")&&(r+=".000"),e("span",r)}},{title:"余量",key:"remain",align:"center",width:180,render:function(e,t){var r=t.row.remain.toString();return-1==r.indexOf(".")&&(r+=".000"),e("span",r)}},{title:"体积",key:"volume",align:"center",width:180},{title:"货物名称",key:"gid",align:"center",width:180,render:function(t,r){return t("div",e.goodsnames.find(function(e){return e.id==r.row.gid}).goodsname)}},{title:"托运合同",key:"contractrote",align:"center",width:180,render:function(t,r){if(""==r.row.contractrote){var a=e;return t("Upload",{props:{action:"/uploadOrderManagement?id="+r.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){a.handleSearch(a.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])}var n=e;return t("div",[t("a",{attrs:{href:r.row.contractrote,target:"_blank"}},"查看图片"),t("Upload",{style:{display:"inline"},props:{action:"/uploadOrderManagement?id="+r.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){n.handleSearch(n.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])])}},{title:"订单时间",key:"ordercreatetime",align:"center",tooltip:!0,width:220},{title:"创建时间",key:"mark",align:"center",tooltip:!0,width:220},{title:"编辑",key:"id",width:150,fixed:"right",align:"center",render:function(t,r){return t("div",[t("Button",{props:{type:"primary",size:"small"},style:{marginRight:"5px"},on:{click:function(){e.dataIndex=r.index,e.show(r.row)}}},"修改"),t("Button",{props:{type:"error",size:"small"},on:{click:function(){e.deleteStatus=!0,e.dataId=r.row.id}}},"删除")])}}]}},components:{orderManagementSearch:r("C7Lr")(i,o,!1,function(e){r("ldNv")},"data-v-ed680bcc",null).exports,Table:r("8Wy1").a},methods:{handleSearch:function(e){this.query=e,this.loading=!0,n.a.get("/api/orderManagement.json",{params:e}).then(this.getOptionsSucc)},getOptionsSucc:function(e){this.loading=!1,(e=e.data).ret&&e.data&&(this.datas=e.data.data,this.dataTotal=e.data.total)},deleteSucc:function(){this.handleSearch(this.query)},pageChange:function(e){this.query.page=e,this.handleSearch(this.query)},handleInsert:function(){this.clearModel(),this.status=!0,this.href="/api/insertOrderManagement.json"},right:function(){var e=this;this.$refs.temp.validate(function(t){t&&(e.loading=!0,n.a.get(e.href,{params:e.temp}).then(e.insertSucc))})},cancel:function(){this.$refs.temp.resetFields(),this.status=!1},otherCancel:function(e){e||this.cancel()},insertSucc:function(e){e=e.data,this.loading=!1,e.ret&&this.handleSearch(this.query),this.status=!1},clearModel:function(){for(var e in this.temp)this.temp[e]="";this.temp.carrier="哪都通（大连）科技有限公司"},handleDelete:function(e){n.a.get("/api/deleteOrderManagement.json",{params:{ids:this.dataId}}).then(this.handleDeleteSucc)},handleDeleteSucc:function(e){this.deleteStatus=!1,(e=e.data).ret?this.handleSearch(this.query):this.$Notice.error({desc:"删除失败",duration:0})},deleteAll:function(e){n.a.get("/api/deleteOrderManagement.json",{params:{ids:e.toString()}}).then(this.handleDeleteSucc)},show:function(e){this.status=!0,this.temp.id=e.id,this.temp.dispatchedparty=e.dispatchedparty,this.temp.carrier=e.carrier,this.temp.departure=e.departure,this.temp.sendername=e.sendername,this.temp.sendertel=e.sendertel,this.temp.destination=e.destination,this.temp.receivername=e.receivername,this.temp.receivertel=e.receivertel,this.temp.gid=e.gid,this.temp.totaltraffic=e.totaltraffic,this.temp.volume=e.volume,this.temp.mark=e.mark,this.temp.time=e.ordercreatetime,this.href="/api/updeteOrderManagement.json"},initPage:function(){n.a.get("/api/orderDispatch.json").then(this.initPageSucc)},initPageSucc:function(e){(e=e.data).ret&&(this.goodsnames=e.data.goodsnames,this.ordernumbers=e.data.ordernumbers)}},mounted:function(){this.initPage()}},s={render:function(){var e=this,t=e.$createElement,r=e._self._c||t;return r("div",[r("orderManagementSearch",{attrs:{ordernumbers:e.ordernumbers,goodsnames:e.goodsnames},on:{handleOptionsSearch:e.handleSearch}}),e._v(" "),r("Table",{attrs:{page:e.query.page,titles:e.titles,datas:e.datas,total:e.dataTotal,loading:e.loading,show:e.showAdd},on:{handleInsert:e.handleInsert,deleteAll:e.deleteAll,pageChange:e.pageChange}}),e._v(" "),r("Modal",{attrs:{"footer-hide":!0,"mask-closable":!1,"ok-text":"确定","cancel-text":"取消",width:"500",styles:{top:"20px"}},on:{"on-visible-change":e.otherCancel},model:{value:e.status,callback:function(t){e.status=t},expression:"status"}},[r("Form",{ref:"temp",staticStyle:{"margin-top":"20px"},attrs:{rules:e.ruleValidate,model:e.temp,"label-width":100}},[r("FormItem",{attrs:{label:"发运方",prop:"dispatchedparty"}},[r("Input",{attrs:{placeholder:"发运方"},model:{value:e.temp.dispatchedparty,callback:function(t){e.$set(e.temp,"dispatchedparty",t)},expression:"temp.dispatchedparty"}})],1),e._v(" "),r("FormItem",{attrs:{label:"承运方",prop:"carrier"}},[r("Input",{attrs:{placeholder:"承运方"},model:{value:e.temp.carrier,callback:function(t){e.$set(e.temp,"carrier",t)},expression:"temp.carrier"}})],1),e._v(" "),r("FormItem",{attrs:{label:"起运地",prop:"departure"}},[r("Input",{attrs:{placeholder:"起运地"},model:{value:e.temp.departure,callback:function(t){e.$set(e.temp,"departure",t)},expression:"temp.departure"}})],1),e._v(" "),r("FormItem",{attrs:{label:"发货人",prop:"sendername"}},[r("Input",{attrs:{placeholder:"发货人"},model:{value:e.temp.sendername,callback:function(t){e.$set(e.temp,"sendername",t)},expression:"temp.sendername"}})],1),e._v(" "),r("FormItem",{attrs:{label:"联系方式",prop:"sendertel"}},[r("Input",{attrs:{placeholder:"联系方式"},model:{value:e.temp.sendertel,callback:function(t){e.$set(e.temp,"sendertel",t)},expression:"temp.sendertel"}})],1),e._v(" "),r("FormItem",{attrs:{label:"到达地",prop:"destination"}},[r("Input",{attrs:{placeholder:"到达地"},model:{value:e.temp.destination,callback:function(t){e.$set(e.temp,"destination",t)},expression:"temp.destination"}})],1),e._v(" "),r("FormItem",{attrs:{label:"收货人",prop:"receivername"}},[r("Input",{attrs:{placeholder:"收货人"},model:{value:e.temp.receivername,callback:function(t){e.$set(e.temp,"receivername",t)},expression:"temp.receivername"}})],1),e._v(" "),r("FormItem",{attrs:{label:"联系方式",prop:"receivertel"}},[r("Input",{attrs:{placeholder:"联系方式"},model:{value:e.temp.receivertel,callback:function(t){e.$set(e.temp,"receivertel",t)},expression:"temp.receivertel"}})],1),e._v(" "),r("FormItem",{attrs:{label:"体积",prop:"volume"}},[r("Input",{attrs:{placeholder:"总体积"},model:{value:e.temp.volume,callback:function(t){e.$set(e.temp,"volume",t)},expression:"temp.volume "}})],1),e._v(" "),r("FormItem",{attrs:{label:"订单时间",prop:"time"}},[r("DatePicker",{staticStyle:{width:"364px"},attrs:{type:"datetime",placeholder:"订单时间"},model:{value:e.temp.time,callback:function(t){e.$set(e.temp,"time",t)},expression:"temp.time"}})],1),e._v(" "),r("FormItem",{attrs:{label:"总量",prop:"totaltraffic"}},[r("InputNumber",{staticStyle:{width:"350px"},attrs:{max:1e7,min:0},model:{value:e.temp.totaltraffic,callback:function(t){e.$set(e.temp,"totaltraffic",t)},expression:"temp.totaltraffic"}}),e._v("吨\n      ")],1),e._v(" "),r("FormItem",{attrs:{label:"货源信息",prop:"gid"}},[r("Select",{model:{value:e.temp.gid,callback:function(t){e.$set(e.temp,"gid",t)},expression:"temp.gid"}},e._l(e.goodsnames,function(t){return r("Option",{key:t.id,attrs:{value:t.id.toString()}},[e._v(e._s(t.goodsname))])}))],1),e._v(" "),r("FormItem",[r("div",{staticStyle:{display:"flex","flex-direction":"row","justify-content":"space-between"}},[r("Button",{staticClass:"button",attrs:{size:"large",type:"success"},on:{click:e.right}},[e._v("确定")]),e._v(" "),r("Button",{staticClass:"button",attrs:{size:"large",type:"info"},on:{click:e.cancel}},[e._v("取消")])],1)])],1)],1),e._v(" "),r("Modal",{attrs:{"ok-text":"删除","cancel-text":"取消","class-name":"vertical-center-modal"},on:{"on-ok":e.handleDelete},model:{value:e.deleteStatus,callback:function(t){e.deleteStatus=t},expression:"deleteStatus"}},[r("p",[e._v("确定删除吗")])])],1)},staticRenderFns:[]};var d=r("C7Lr")(l,s,!1,function(e){r("Z4WM")},"data-v-572b04bf",null);t.default=d.exports},Z4WM:function(e,t){},ldNv:function(e,t){}});