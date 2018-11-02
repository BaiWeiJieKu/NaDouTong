webpackJsonp([9],{"4r/x":function(e,t){},"q+WQ":function(e,t){},vTh8:function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=a("aozt"),r=a.n(n),i={name:"optionsformationSearch",data:function(){return{formItem:{ordernumber:"",singlenumber:"",start:"",end:new Date,departure:"",destination:"",realname:"",numberplate:"",fleetname:"",page:1},timeList:[{key:"ordercreatetime",value:"订单时间"},{key:"sendcreatetime",value:"派单时间"},{key:"departuretime",value:"出发时间"},{key:"arrivaltime",value:"到达时间"}],formRule:{},data:[]}},props:{ordernumbers:Array,singlenumbers:Array,realnames:Array,numberplates:Array,fleetnames:Array},methods:{handleSubmit:function(e){var t=this;this.$refs[e].validate(function(e){e?t.$emit("handleOptionsSearch",t.formItem):t.$Message.error("请填写必填字段")})},startChange:function(e){var t=new Date(this.formItem.end);new Date(e)>t&&(this.formItem.start="")},endChange:function(e){var t=new Date(this.formItem.start);new Date(e)<t&&(this.formItem.end="")}}},l={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"search"},[a("Form",{ref:"formItem",attrs:{model:e.formItem,rules:e.formRule,"label-position":"left","label-width":60,inline:""}},[a("FormItem",{attrs:{label:"订单号",prop:"numberplate"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.ordernumber,callback:function(t){e.$set(e.formItem,"ordernumber",t)},expression:"formItem.ordernumber"}},e._l(e.ordernumbers,function(t,n){return a("Option",{key:n,attrs:{value:t,name:n}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"运单号",prop:"singlenumber"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.singlenumber,callback:function(t){e.$set(e.formItem,"singlenumber",t)},expression:"formItem.singlenumber"}},e._l(e.singlenumbers,function(t,n){return a("Option",{key:n,attrs:{value:t,name:t}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"时间类型",prop:"timetype"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.timetype,callback:function(t){e.$set(e.formItem,"timetype",t)},expression:"formItem.timetype"}},e._l(e.timeList,function(t){return a("Option",{key:t.key,attrs:{value:t.key,name:t.key}},[e._v(e._s(t.value))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"开始时间",prop:"start"}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},on:{"on-change":e.startChange},model:{value:e.formItem.start,callback:function(t){e.$set(e.formItem,"start",t)},expression:"formItem.start"}})],1),e._v(" "),a("FormItem",{attrs:{label:"~",prop:"end","label-width":30}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},on:{"on-change":e.endChange},model:{value:e.formItem.end,callback:function(t){e.$set(e.formItem,"end",t)},expression:"formItem.end"}})],1),e._v(" "),a("FormItem",{attrs:{label:"出发地",prop:"departure"}},[a("Input",{attrs:{placeholder:"出发地"},model:{value:e.formItem.departure,callback:function(t){e.$set(e.formItem,"departure",t)},expression:"formItem.departure"}})],1),e._v(" "),a("FormItem",{attrs:{label:"到达地",prop:"destination"}},[a("Input",{attrs:{placeholder:"到达地"},model:{value:e.formItem.destination,callback:function(t){e.$set(e.formItem,"destination",t)},expression:"formItem.destination"}})],1),e._v(" "),a("FormItem",{attrs:{label:"司机",prop:"realname"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.realname,callback:function(t){e.$set(e.formItem,"realname",t)},expression:"formItem.realname"}},e._l(e.realnames,function(t,n){return a("Option",{key:n,attrs:{value:t.id,name:t.id}},[e._v(e._s(t.realname))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"车牌号",prop:"numberplate"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.numberplate,callback:function(t){e.$set(e.formItem,"numberplate",t)},expression:"formItem.numberplate"}},e._l(e.numberplates,function(t,n){return a("Option",{key:n,attrs:{value:t,name:t}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"所属车队",prop:"fleetname"}},[a("Select",{staticStyle:{width:"160px"},model:{value:e.formItem.fleetname,callback:function(t){e.$set(e.formItem,"fleetname",t)},expression:"formItem.fleetname"}},e._l(e.fleetnames,function(t,n){return a("Option",{key:n,attrs:{value:t.id,name:t.id}},[e._v(e._s(t.fleetname))])}))],1),e._v(" "),a("FormItem",{staticStyle:{"margin-left":"-60px"}},[a("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formItem")}}},[e._v("查询")])],1)],1)],1)},staticRenderFns:[]};var s={name:"transportManagement",data:function(){var e=this;return{ruleValidate:{begintime:[{required:!0,validator:function(t,a,n){""==e.temp.begintime?n(new Error("请选择出发时间")):""!=a&&n()}}],endtime:[{required:!0,validator:function(t,a,n){""==e.temp.endtime?n(new Error("请选择到达时间")):""!=a&&n()}}]},showAdd:!1,ordernumbers:[],singlenumbers:[],realnames:[],numberplates:[],fleetnames:[],deleteStatus:!1,query:{},datas:[],href:"",dataId:"",dataTotal:0,searchItems:{},loading:!1,status:!1,temp:{id:"",begintime:"",endtime:""},titles:[{type:"selection",align:"center",width:50,fixed:"left"},{title:"序号",key:"sequence",width:70,fixed:"left",align:"center",render:function(e,t){return e("div",[e("span",{props:{type:"primary",size:"small"},style:{marginRight:"5px"}},t.index+1)])}},{title:"派单号",key:"singlenumber",align:"center",width:180},{title:"所属订单",key:"ordernumber",align:"center",width:180,fixed:"left"},{title:"运单状态",key:"waybillstate",align:"center",width:110,fixed:"left"},{title:"车牌号",key:"orderdriver",align:"center",width:180},{title:"派单司机",key:"numberplate",align:"center",width:130,render:function(t,a){return t("div",e.realnames.find(function(e){return e.id==a.row.numberplate}).realname)}},{title:"派单时间",key:"createtime",align:"center",width:180},{title:"发货人",key:"sendername",align:"center",width:130},{title:"发货人联系电话",key:"sendertel",align:"center",width:180},{title:"发货地址",key:"departure",align:"center",width:260},{title:"收货人",key:"receivername",align:"center",width:180},{title:"收货联系电话",key:"receivertel",align:"center",width:180},{title:"收货地址",key:"destination",align:"center",width:260},{title:"派量",key:"oncetraffic",align:"center",width:130},{title:"派单金额",key:"ordermoney",align:"center",width:130},{title:"出发时间",key:"btime",align:"center",width:180},{title:"到达时间",key:"etime",align:"center",width:180},{title:"运单合同照片",key:"transport",align:"center",width:180,render:function(t,a){if(""==a.row.contractrote){var n=e;return t("Upload",{props:{action:"/uploadTransport?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){n.handleSearch(n.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])}var r=e;return t("div",[t("a",{attrs:{href:a.row.contractrote,target:"_blank"}},"查看图片"),t("Upload",{style:{display:"inline"},props:{action:"/uploadTransport?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){r.handleSearch(r.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])])}},{title:"操作人",key:"operating",align:"center",width:150},{title:"创建时间",key:"createtime",align:"center",tooltip:!0,width:200},{title:"备注",key:"mark",align:"center",tooltip:!0,width:200},{title:"编辑",key:"id",width:150,fixed:"right",align:"center",render:function(t,a){if(console.log(a.row),-1!=a.row.waybillstate.indexOf("接单中"))return t("div",[t("Button",{props:{type:"error",size:"small"},on:{click:function(){e.deleteStatus=!0,e.dataId=a.row.id}}},"删除"),t("Button",{style:{marginLeft:"3px"},props:{type:"info",size:"small"},on:{click:function(){e.temp.id=a.row.id,e.status=!0}}},"完成")])}}]}},components:{dispatchManagementSearch:a("C7Lr")(i,l,!1,function(e){a("q+WQ")},"data-v-7808fcd9",null).exports,Table:a("8Wy1").a},methods:{handleSearch:function(e){this.query=e,this.loading=!0,r.a.get("/api/transportManagement.json",{params:e}).then(this.getOptionsSucc)},getOptionsSucc:function(e){this.loading=!1,(e=e.data).ret&&e.data&&(this.datas=e.data.data,this.dataTotal=e.data.total)},deleteSucc:function(){this.handleSearch(this.query)},pageChange:function(e){this.query.page=e,this.handleSearch(this.query)},handleInsert:function(){this.clearModel(),this.status=!0,this.href="/api/finishDispatchManagement.json"},right:function(){var e=this;this.$refs.temp.validate(function(t){t&&(e.loading=!0,r.a.get("/api/finishDispatchManagement.json",{params:e.temp}).then(e.insertSucc))})},cancel:function(){this.status=!1,this.temp.begintime="",this.temp.endtime=""},insertSucc:function(e){e=e.data,this.loading=!1,e.ret&&this.handleSearch(this.query),this.status=!1},clearModel:function(){for(var e in this.temp)this.temp[e]=""},handleDelete:function(e){r.a.get("/api/deleteTransportManagement.json",{params:{ids:this.dataId}}).then(this.handleDeleteSucc)},handleDeleteSucc:function(e){this.deleteStatus=!1,(e=e.data).ret?this.handleSearch(this.query):this.$Notice.error({desc:"删除失败",duration:0})},deleteAll:function(e){r.a.get("/api/deleteTransportManagement.json",{params:{ids:e.toString()}}).then(this.handleDeleteSucc)},show:function(e){this.href="/api/updeteTransportManagement.json"},initPage:function(){r.a.get("/api/transportReceipt.json").then(this.initPageSucc)},initPageSucc:function(e){(e=e.data).ret&&(this.ordernumbers=e.data.ordernumbers,this.singlenumbers=e.data.singlenumbers,this.realnames=e.data.realnames,this.numberplates=e.data.numberplates,this.fleetnames=e.data.fleetnames)}},mounted:function(){this.initPage()}},o={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("dispatchManagementSearch",{attrs:{ordernumbers:e.ordernumbers,singlenumbers:e.singlenumbers,realnames:e.realnames,numberplates:e.numberplates,fleetnames:e.fleetnames},on:{handleOptionsSearch:e.handleSearch}}),e._v(" "),a("Table",{attrs:{page:e.query.page,titles:e.titles,datas:e.datas,total:e.dataTotal,loading:e.loading,show:e.showAdd},on:{handleInsert:e.handleInsert,deleteAll:e.deleteAll,pageChange:e.pageChange}}),e._v(" "),a("Modal",{attrs:{"mask-closable":!1,"footer-hide":!0,"ok-text":"确定","cancel-text":"取消",width:"500",styles:{top:"20px"}},model:{value:e.status,callback:function(t){e.status=t},expression:"status"}},[a("Form",{ref:"temp",staticStyle:{"margin-top":"20px"},attrs:{model:e.temp,rules:e.ruleValidate,"label-width":100}},[a("FormItem",{attrs:{label:"出发时间",prop:"begintime"}},[a("DatePicker",{staticStyle:{width:"340px"},attrs:{type:"datetime",placeholder:"请选择时间"},model:{value:e.temp.begintime,callback:function(t){e.$set(e.temp,"begintime",t)},expression:"temp.begintime"}})],1),e._v(" "),a("FormItem",{attrs:{label:"到达时间",prop:"endtime"}},[a("DatePicker",{staticStyle:{width:"340px"},attrs:{type:"datetime",placeholder:"请选择时间"},model:{value:e.temp.endtime,callback:function(t){e.$set(e.temp,"endtime",t)},expression:"temp.endtime"}})],1),e._v(" "),a("FormItem",[a("div",{staticStyle:{display:"flex","flex-direction":"row","justify-content":"space-between"}},[a("Button",{staticClass:"button",attrs:{size:"large",type:"success"},on:{click:e.right}},[e._v("确定")]),e._v(" "),a("Button",{staticClass:"button",attrs:{size:"large",type:"info"},on:{click:e.cancel}},[e._v("取消")])],1)])],1)],1),e._v(" "),a("Modal",{attrs:{"ok-text":"删除","cancel-text":"取消","class-name":"vertical-center-modal"},on:{"on-ok":e.handleDelete},model:{value:e.deleteStatus,callback:function(t){e.deleteStatus=t},expression:"deleteStatus"}},[a("p",[e._v("确定删除吗")])])],1)},staticRenderFns:[]};var m=a("C7Lr")(s,o,!1,function(e){a("4r/x")},"data-v-3c154ef8",null);t.default=m.exports}});