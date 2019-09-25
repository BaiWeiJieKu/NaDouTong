webpackJsonp([6],{"1jsl":function(e,t,a){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var r={name:"bdMaps",methods:{updatePolylinePath:function(e){this.polylinePath=e.target.getPath()},addPolylinePoint:function(){this.polylinePath.push()}},props:{mapData:{Array:Array,default:[]},center:{Object:Object},show:{Boolean:Boolean,default:!1}}},n={render:function(){var e=this.$createElement,t=this._self._c||e;return t("baidu-map",{ref:"bdmap",staticClass:"map",attrs:{center:this.center,zoom:13,"scroll-wheel-zoom":!0}},this._l(this.mapData,function(e,a){return t("bm-marker",{key:a,attrs:{position:e,dragging:!1,animation:"BMAP_ANIMATION_BOUNCE"}},[t("bm-label",{attrs:{content:e.time,labelStyle:{color:"red",fontSize:"18px"},offset:{width:-35,height:30}}})],1)}))},staticRenderFns:[]};var i=a("C7Lr")(r,n,!1,function(e){a("6lWC")},null,null).exports,l=a("aozt"),s=a.n(l),o={name:"optionsformationSearch",data:function(){return{formItem:{ordernumber:"",singlenumber:"",start:"",end:new Date,departure:"",destination:"",realname:"",numberplate:"",fleetname:"",page:1},timeList:[{key:"ordercreatetime",value:"订单时间"},{key:"sendcreatetime",value:"派单时间"},{key:"departuretime",value:"出发时间"},{key:"arrivaltime",value:"到达时间"}],formRule:{},data:[]}},props:{ordernumbers:Array,singlenumbers:Array,realnames:Array,numberplates:Array,fleetnames:Array},methods:{handleSubmit:function(e){var t=this;this.$refs[e].validate(function(e){e?t.$emit("handleOptionsSearch",t.formItem):t.$Message.error("请填写必填字段")})},startChange:function(e){var t=new Date(this.formItem.end);new Date(e)>t&&(this.formItem.start="")},endChange:function(e){var t=new Date(this.formItem.start);new Date(e)<t&&(this.formItem.end="")}}},m={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",{staticClass:"search"},[a("Form",{ref:"formItem",attrs:{model:e.formItem,rules:e.formRule,"label-position":"left","label-width":60,inline:""}},[a("FormItem",{attrs:{label:"订单号",prop:"numberplate"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:"",filterable:""},model:{value:e.formItem.ordernumber,callback:function(t){e.$set(e.formItem,"ordernumber",t)},expression:"formItem.ordernumber"}},e._l(e.ordernumbers,function(t,r){return a("Option",{key:r,attrs:{value:t,name:r}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"运单号",prop:"singlenumber"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:"",filterable:""},model:{value:e.formItem.singlenumber,callback:function(t){e.$set(e.formItem,"singlenumber",t)},expression:"formItem.singlenumber"}},e._l(e.singlenumbers,function(t,r){return a("Option",{key:r,attrs:{value:t,name:t}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"时间类型",prop:"timetype"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:""},model:{value:e.formItem.timetype,callback:function(t){e.$set(e.formItem,"timetype",t)},expression:"formItem.timetype"}},e._l(e.timeList,function(t){return a("Option",{key:t.key,attrs:{value:t.key,name:t.key}},[e._v(e._s(t.value))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"开始时间",prop:"start"}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},model:{value:e.formItem.start,callback:function(t){e.$set(e.formItem,"start",t)},expression:"formItem.start"}})],1),e._v(" "),a("FormItem",{attrs:{label:"~",prop:"end","label-width":30}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},model:{value:e.formItem.end,callback:function(t){e.$set(e.formItem,"end",t)},expression:"formItem.end"}})],1),e._v(" "),a("FormItem",{attrs:{label:"出发地",prop:"departure"}},[a("Input",{attrs:{placeholder:"出发地"},model:{value:e.formItem.departure,callback:function(t){e.$set(e.formItem,"departure",t)},expression:"formItem.departure"}})],1),e._v(" "),a("FormItem",{attrs:{label:"到达地",prop:"destination"}},[a("Input",{attrs:{placeholder:"到达地"},model:{value:e.formItem.destination,callback:function(t){e.$set(e.formItem,"destination",t)},expression:"formItem.destination"}})],1),e._v(" "),a("FormItem",{attrs:{label:"司机",prop:"realname"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:"",filterable:""},model:{value:e.formItem.realname,callback:function(t){e.$set(e.formItem,"realname",t)},expression:"formItem.realname"}},e._l(e.realnames,function(t,r){return a("Option",{key:r,attrs:{value:t.id,name:t.id}},[e._v(e._s(t.realname))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"车牌号",prop:"numberplate"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:"",filterable:""},model:{value:e.formItem.numberplate,callback:function(t){e.$set(e.formItem,"numberplate",t)},expression:"formItem.numberplate"}},e._l(e.numberplates,function(t,r){return a("Option",{key:r,attrs:{value:t,name:t}},[e._v(e._s(t))])}))],1),e._v(" "),a("FormItem",{attrs:{label:"所属车队",prop:"fleetname"}},[a("Select",{staticStyle:{width:"160px"},attrs:{clearable:"",filterable:""},model:{value:e.formItem.fleetname,callback:function(t){e.$set(e.formItem,"fleetname",t)},expression:"formItem.fleetname"}},e._l(e.fleetnames,function(t,r){return a("Option",{key:r,attrs:{value:t.id,name:t.id}},[e._v(e._s(t.fleetname))])}))],1),e._v(" "),a("FormItem",{staticStyle:{"margin-left":"-60px"}},[a("Button",{attrs:{type:"primary"},on:{click:function(t){e.handleSubmit("formItem")}}},[e._v("查询")])],1)],1)],1)},staticRenderFns:[]};var d={name:"receipt",data:function(){var e=this;return{modalTitle:"",mapinit:{},zoom:0,mapData:[],mapStatus:!1,showAdd:!1,ordernumbers:[],singlenumbers:[],realnames:[],numberplates:[],fleetnames:[],deleteStatus:!1,query:{},datas:[],href:"",dataId:"",dataTotal:0,searchItems:{},loading:!1,status:!1,titles:[{type:"selection",align:"center",width:50,fixed:"left"},{title:"序号",key:"sequence",width:70,fixed:"left",align:"center",render:function(e,t){return e("div",[e("span",{props:{type:"primary",size:"small"},style:{marginRight:"5px"}},t.index+1)])}},{title:"订单号",key:"ordernumber",align:"center",width:220,fixed:"left"},{title:"运单号",key:"singlenumber",align:"center",width:220},{title:"运单状态",key:"waybillstate",align:"center",width:130},{title:"查看轨迹",key:"location",align:"center",width:130,render:function(t,a){return""==a.row.location?t("span","没有地图数据"):t("div",[t("Button",{props:{type:"info",size:"small"},on:{click:function(){e.modalTitle="车牌号: "+a.row.orderdriver+" 出发时间: "+a.row.btime+" 到达时间: "+a.row.etime;var t=a.row.location.split(";"),r=new Array;t.map(function(e,t){var a=e.split(","),n={lng:a[1],lat:a[0],time:a[2]};r.push(n)});var n=Math.floor(r.length/2);e.mapinit=r[n],e.mapData=r,e.mapStatus=!0,e.zoom=15,console.log(e.mapData)}}},"查看轨迹")])}},{title:"司机姓名",key:"departure",align:"center",width:130,render:function(t,a){return t("div",e.realnames.find(function(e){return e.id==a.row.numberplate}).realname)}},{title:"车牌号",key:"orderdriver",align:"center",width:180},{title:"订单时间",key:"departure",align:"center",width:210},{title:"派单时间",key:"createtime",align:"center",width:210},{title:"发货人",key:"sendername",align:"center",width:130},{title:"联系方式",key:"sendertel",align:"center",width:180},{title:"发货地址",key:"departure",align:"center",width:260},{title:"收货人",key:"receivername",align:"center",width:130},{title:"联系方式",key:"receivertel",align:"center",width:180},{title:"收货地址",key:"destination",align:"center",width:260},{title:"本次运量",key:"oncetraffic",align:"center",width:130,render:function(e,t){var a=t.row.oncetraffic.toString();return-1==a.indexOf(".")&&(a+=".000"),e("span",a)}},{title:"本次运费",key:"ordermoney",align:"center",width:130},{title:"出发时间",key:"btime",align:"center",width:180},{title:"到达时间",key:"etime",align:"center",width:180},{title:"操作人",key:"operating",align:"center",width:130},{title:"电子运输合同",key:"contractrote",align:"center",width:180,render:function(t,a){if(""==a.row.transport){var r=e;return t("Upload",{props:{action:"/uploadTransport?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){r.handleSearch(r.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])}var n=e;return t("div",[t("a",{attrs:{href:a.row.transport,target:"_blank"}},"查看图片"),t("Upload",{style:{display:"inline"},props:{action:"/uploadTransport?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){n.handleSearch(n.query)}}},[t("Button",{props:{icon:"ios-cloud-upload"}})])])}},{title:"备注",key:"mark",align:"center",tooltip:!0,width:220},{title:"编辑",key:"id",width:150,fixed:"right",align:"center",render:function(t,a){return t("div",[t("Button",{props:{type:"error",size:"small"},on:{click:function(){e.deleteStatus=!0,e.dataId=a.row.id}}},"删除")])}}]}},components:{orderManagementSearch:a("C7Lr")(o,m,!1,function(e){a("PJfX")},"data-v-2606295e",null).exports,Table:a("8Wy1").a,bdMaps:i},methods:{handleSearch:function(e){this.query=e,this.loading=!0,s.a.get("/api/receipt.json",{params:e}).then(this.getOptionsSucc)},getOptionsSucc:function(e){this.loading=!1,(e=e.data).ret&&e.data&&(this.datas=e.data.data,this.dataTotal=e.data.total)},deleteSucc:function(){this.handleSearch(this.query)},pageChange:function(e){this.query.page=e,this.handleSearch(this.query)},handleInsert:function(){this.clearModel(),this.status=!0,this.href="/api/insertReceipt.json"},right:function(){var e=this;this.$refs.temp.validate(function(t){t&&(e.loading=!0,s.a.get(e.href,{params:e.temp}).then(e.insertSucc))})},cancel:function(){this.$refs.temp.resetFields(),this.status=!1},otherCancel:function(e){e||this.cancel()},insertSucc:function(e){e=e.data,this.loading=!1,e.ret&&this.handleSearch(this.query),this.status=!1},clearModel:function(){for(var e in this.temp)this.temp[e]=""},handleDelete:function(e){s.a.get("/api/deleteReceipt.json",{params:{ids:this.dataId}}).then(this.handleDeleteSucc)},handleDeleteSucc:function(e){this.deleteStatus=!1,(e=e.data).ret?this.handleSearch(this.query):this.$Notice.error({desc:"删除失败",duration:0})},deleteAll:function(e){s.a.get("/api/deleteReceipt.json",{params:{ids:e.toString()}}).then(this.handleDeleteSucc)},show:function(e){this.status=!0,this.temp.id=e.id,this.temp.brandModel=e.brandModel,this.temp.businessLicense=e.businessLicense,this.temp.businessName=e.businessName,this.temp.businessTel=e.businessTel,this.temp.carLength=e.carLength,this.temp.carType=e.carType,this.temp.cid=e.cid,this.temp.fullLoad=e.fullLoad,this.temp.mark=e.mark,this.temp.maxLoad=e.maxLoad,this.temp.numberPlate=e.numberPlate,this.temp.plateColor=e.plateColor,this.temp.plateType=e.plateType,this.temp.roadTransportCertificate=e.roadTransportCertificate,this.href="/api/updeteReceipt.json"},initPage:function(){s.a.get("/api/transportReceipt.json").then(this.initPageSucc)},initPageSucc:function(e){(e=e.data).ret&&(this.ordernumbers=e.data.ordernumbers,this.singlenumbers=e.data.singlenumbers,this.realnames=e.data.realnames,this.numberplates=e.data.numberplates,this.fleetnames=e.data.fleetnames)}},mounted:function(){this.initPage()}},c={render:function(){var e=this,t=e.$createElement,a=e._self._c||t;return a("div",[a("orderManagementSearch",{attrs:{ordernumbers:e.ordernumbers,singlenumbers:e.singlenumbers,realnames:e.realnames,numberplates:e.numberplates,fleetnames:e.fleetnames},on:{handleOptionsSearch:e.handleSearch}}),e._v(" "),a("Table",{attrs:{page:e.query.page,titles:e.titles,datas:e.datas,total:e.dataTotal,loading:e.loading,show:e.showAdd},on:{handleInsert:e.handleInsert,deleteAll:e.deleteAll,pageChange:e.pageChange}}),e._v(" "),a("Modal",{attrs:{"ok-text":"删除","cancel-text":"取消","class-name":"vertical-center-modal"},on:{"on-ok":e.handleDelete},model:{value:e.deleteStatus,callback:function(t){e.deleteStatus=t},expression:"deleteStatus"}},[a("p",[e._v("确定删除吗")])]),e._v(" "),a("Modal",{attrs:{"class-name":"vertical-center-modal","footer-hide":"",width:780},model:{value:e.mapStatus,callback:function(t){e.mapStatus=t},expression:"mapStatus"}},[a("p",{attrs:{slot:"header"},slot:"header"},[e._v(e._s(this.modalTitle))]),e._v(" "),a("div",[a("keep-alive",[a("bdMaps",{directives:[{name:"show",rawName:"v-show",value:e.mapStatus,expression:"mapStatus"}],attrs:{mapData:e.mapData,center:e.mapinit,show:e.mapStatus}})],1)],1)])],1)},staticRenderFns:[]};var u=a("C7Lr")(d,c,!1,function(e){a("jKVS")},"data-v-60ab9902",null);t.default=u.exports},"6lWC":function(e,t){},PJfX:function(e,t){},jKVS:function(e,t){}});