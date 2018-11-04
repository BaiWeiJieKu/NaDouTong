webpackJsonp([7],{"1rZq":function(t,e,a){"use strict";Object.defineProperty(e,"__esModule",{value:!0});var r=a("aozt"),n=a.n(r),l={name:"optionsformationSearch",data:function(){return{formItem:{numberplate:"",roadtransportcertificate:"",start:"",end:new Date,page:1},formRule:{},data:[]}},methods:{handleSubmit:function(t){var e=this;this.$refs[t].validate(function(t){t?e.$emit("handleOptionsSearch",e.formItem):e.$Message.error("请填写必填字段")})},startChange:function(t){var e=new Date(this.formItem.end);new Date(t)>e&&(this.formItem.start="")},endChange:function(t){var e=new Date(this.formItem.start);new Date(t)<e&&(this.formItem.end="")}}},i={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{staticClass:"search"},[a("Form",{ref:"formItem",attrs:{model:t.formItem,rules:t.formRule,"label-position":"left","label-width":90,inline:""}},[a("FormItem",{attrs:{label:"车牌号",prop:"numberplate"}},[a("Input",{attrs:{placeholder:"车牌号"},model:{value:t.formItem.numberplate,callback:function(e){t.$set(t.formItem,"numberplate",e)},expression:"formItem.numberplate"}})],1),t._v(" "),a("FormItem",{attrs:{label:"道路运输证号",prop:"roadtransportcertificate"}},[a("Input",{attrs:{placeholder:"道路运输证号"},model:{value:t.formItem.roadtransportcertificate,callback:function(e){t.$set(t.formItem,"roadtransportcertificate",e)},expression:"formItem.roadtransportcertificate"}})],1),t._v(" "),a("FormItem",{attrs:{label:"开始时间",prop:"start"}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},on:{"on-change":t.startChange},model:{value:t.formItem.start,callback:function(e){t.$set(t.formItem,"start",e)},expression:"formItem.start"}})],1),t._v(" "),a("FormItem",{attrs:{label:"~",prop:"end","label-width":30}},[a("DatePicker",{staticStyle:{width:"160px"},attrs:{type:"date",placeholder:"请选择时间"},on:{"on-change":t.endChange},model:{value:t.formItem.end,callback:function(e){t.$set(t.formItem,"end",e)},expression:"formItem.end"}})],1),t._v(" "),a("FormItem",{staticStyle:{"margin-left":"-60px"}},[a("Button",{attrs:{type:"primary"},on:{click:function(e){t.handleSubmit("formItem")}}},[t._v("查询")])],1)],1)],1)},staticRenderFns:[]};var s={name:"optionsInformation",data:function(){var t=this;return{ruleValidate:{numberplate:[{required:!0,message:"请输入车牌号",trigger:"blur"}],platetype:[{required:!0,message:"请选择车牌类型",trigger:"change"}],platecolor:[{required:!0,message:"请选择车牌颜色",trigger:"change"}],cartype:[{required:!0,message:"请选择车辆类型",trigger:"change"}],carlength:[{required:!0,validator:function(t,e,a){console.log(e),e&&""!=e?a():""!=e&&a(new Error("请选择车长"))},trigger:"change"}],fullload:[{required:!0,message:"请输入满载重量"}],maxload:[{required:!0,message:"请输入最大载货吨数"}],roadtransportcertificate:[{required:!0,message:"请输入道路运输证号",trigger:"blur"}],businessname:[{required:!0,message:"请输入业户名称",trigger:"blur"}],brandmodel:[{required:!0,message:"请输入品牌型号",trigger:"blur"}]},showAdd:!0,deleteStatus:!1,query:{},datas:[],href:"",dataId:"",dataTotal:0,searchItems:{},loading:!1,status:!1,cids:[],temp:{id:"",numberplate:"",platetype:"大型汽车号牌",platecolor:"黄色",cartype:"牵引车",carlength:4.2,fullload:"",maxload:"",roadtransportcertificate:"",businessname:"",businesstel:"",businesslicense:"",brandmodel:"",mark:""},titles:[{type:"selection",align:"center",width:50,fixed:"left"},{title:"序号",key:"sequence",width:70,fixed:"left",align:"center",render:function(t,e){return t("div",[t("span",{props:{type:"primary",size:"small"},style:{marginRight:"5px"}},e.index+1)])}},{title:"车牌号",key:"numberplate",align:"center",width:110,fixed:"left"},{title:"车牌类型",key:"platetype",align:"center",width:130},{title:"车牌颜色",key:"platecolor",align:"center",width:100},{title:"车辆类型",key:"cartype",align:"center",width:100},{title:"车长",key:"carlength",align:"center",width:70,render:function(t,e){return-1==e.row.carlength?t("span","其他"):t("span",e.row.carlength)}},{title:"满载重量",key:"fullload",align:"center",width:110},{title:"最大载货",key:"maxload",align:"center",width:110},{title:"道路运输号",key:"roadtransportcertificate",align:"center",width:130},{title:"业户名称",key:"businessname",align:"center",width:110},{title:"业户电话",key:"businesstel",align:"center",width:130},{title:"经营许可证",key:"businesslicense",align:"center",width:180},{title:"品牌型号",key:"brandmodel",align:"center",width:110},{title:"创建时间",key:"createtime",align:"center",width:150},{title:"行驶证照",key:"drivinglicensepath",align:"center",width:180,render:function(e,a){if(""==a.row.drivinglicensepath){var r=t;return e("Upload",{props:{action:"/uploadDrivingLicensePath?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){r.handleSearch(r.query)}}},[e("Button",{props:{icon:"ios-cloud-upload"}})])}var n=t;return e("div",[e("a",{attrs:{href:a.row.drivinglicensepath,target:"_blank"}},"查看图片"),e("Upload",{style:{display:"inline"},props:{action:"/uploadDrivingLicensePath?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){n.handleSearch(n.query)}}},[e("Button",{props:{icon:"ios-cloud-upload"}})])])}},{title:"运营证照",key:"operatinglicencepath",align:"center",width:180,render:function(e,a){if(""==a.row.operatinglicencepath){var r=t;return e("Upload",{props:{action:"/uploadOperatingLicencePath?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){r.handleSearch(r.query)}}},[e("Button",{props:{icon:"ios-cloud-upload"}})])}var n=t;return e("div",[e("a",{attrs:{href:a.row.operatinglicencepath,target:"_blank"}},"查看图片"),e("Upload",{style:{display:"inline"},props:{action:"/uploadOperatingLicencePath?id="+a.row.id,accept:"image/*","show-upload-list":!1,onSuccess:function(){n.handleSearch(n.query)}}},[e("Button",{props:{icon:"ios-cloud-upload"}})])])}},{title:"备注",key:"mark",align:"center",tooltip:!0,width:220},{title:"编辑",key:"id",width:150,fixed:"right",align:"center",render:function(e,a){return e("div",[e("Button",{props:{type:"primary",size:"small"},style:{marginRight:"5px"},on:{click:function(){t.dataIndex=a.row.id,t.show(a.row)}}},"修改"),e("Button",{props:{type:"error",size:"small"},on:{click:function(){t.deleteStatus=!0,t.dataId=a.row.id}}},"删除")])}}]}},components:{optionsInformationSearch:a("C7Lr")(l,i,!1,function(t){a("2MEy")},"data-v-b79d6ee8",null).exports,Table:a("8Wy1").a},methods:{handleSearch:function(t){this.query=t,this.loading=!0,n.a.get("/api/optionsInformation.json",{params:this.query}).then(this.getOptionsSucc)},getOptionsSucc:function(t){this.loading=!1,(t=t.data).ret&&t.data&&(this.datas=t.data.data,this.dataTotal=t.data.total)},deleteSucc:function(){this.handleSearch(this.query)},pageChange:function(t){this.query.page=t,this.handleSearch(this.query)},handleInsert:function(){this.clearModel(),this.status=!0,this.href="/api/insertOptionsInformation.json"},right:function(){var t=this;this.$refs.temp.validate(function(e){console.log("valid:",e),e&&(t.loading=!0,n.a.get(t.href,{params:t.temp}).then(t.insertSucc))})},cancel:function(){this.$refs.temp.resetFields(),this.status=!1},otherCancel:function(t){t||this.cancel()},insertSucc:function(t){t=t.data,this.loading=!1,t.ret&&this.handleSearch(this.query),this.status=!1},clearModel:function(){for(var t in this.temp)this.temp[t]="";this.temp.platetype="大型汽车号牌",this.temp.platecolor="黄色",this.temp.cartype="牵引车",this.carlength=4.2},handleDelete:function(t){n.a.get("/api/deleteOptionsInformation.json",{params:{ids:this.dataId}}).then(this.handleDeleteSucc)},handleDeleteSucc:function(t){this.deleteStatus=!1,(t=t.data).ret?this.handleSearch(this.query):this.$Notice.error({desc:"删除失败",duration:0})},deleteAll:function(t){n.a.get("/api/deleteOptionsInformation.json",{params:{ids:t.toString()}}).then(this.handleDeleteSucc)},show:function(t){this.status=!0,this.temp.id=t.id,this.temp.brandmodel=t.brandmodel,this.temp.businesslicense=t.businesslicense,this.temp.businessname=t.businessname,this.temp.businesstel=t.businesstel,this.temp.carlength=t.carlength,this.temp.cartype=t.cartype,this.temp.cid=t.cid,this.temp.fullload=t.fullload,this.temp.mark=t.mark,this.temp.maxload=t.maxload,this.temp.numberplate=t.numberplate,this.temp.platecolor=t.platecolor,this.temp.platetype=t.platetype,this.temp.roadtransportcertificate=t.roadtransportcertificate,this.href="/api/updeteOptionsInformation.json"},getDriverManagement:function(){n.a.get("/api/optionsDriverManagement.json").then(this.getDriverSucc)},getDriverSucc:function(t){(t=t.data).ret&&(this.cids=t.data)}},mounted:function(){this.getDriverManagement()}},o={render:function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("optionsInformationSearch",{on:{handleOptionsSearch:t.handleSearch}}),t._v(" "),a("Table",{ref:"table",attrs:{page:t.query.page,titles:t.titles,datas:t.datas,total:t.dataTotal,loading:t.loading,show:t.showAdd},on:{handleInsert:t.handleInsert,deleteAll:t.deleteAll,pageChange:t.pageChange}}),t._v(" "),a("Modal",{attrs:{"footer-hide":!0,"ok-text":"确定","cancel-text":"取消","mask-closable":!1,width:"500",styles:{top:"20px"}},on:{"on-visible-change":t.otherCancel},model:{value:t.status,callback:function(e){t.status=e},expression:"status"}},[a("Form",{ref:"temp",staticStyle:{"margin-top":"20px"},attrs:{rules:t.ruleValidate,model:t.temp,"label-width":100}},[a("FormItem",{attrs:{label:"车牌号",prop:"numberplate"}},[a("Input",{attrs:{placeholder:"车牌号"},model:{value:t.temp.numberplate,callback:function(e){t.$set(t.temp,"numberplate",e)},expression:"temp.numberplate"}})],1),t._v(" "),a("FormItem",{attrs:{label:"车牌类型",prop:"platetype"}},[a("Select",{model:{value:t.temp.platetype,callback:function(e){t.$set(t.temp,"platetype",e)},expression:"temp.platetype"}},[a("Option",{attrs:{value:"大型汽车号牌"}},[t._v("大型汽车号牌")]),t._v(" "),a("Option",{attrs:{value:"小型汽车号牌"}},[t._v("小型汽车号牌")]),t._v(" "),a("Option",{attrs:{value:"其他号牌"}},[t._v("其他号牌")])],1)],1),t._v(" "),a("FormItem",{attrs:{label:"车牌颜色",prop:"platecolor"}},[a("Select",{model:{value:t.temp.platecolor,callback:function(e){t.$set(t.temp,"platecolor",e)},expression:"temp.platecolor"}},[a("Option",{attrs:{value:"黄色"}},[t._v("黄色")]),t._v(" "),a("Option",{attrs:{value:"蓝色"}},[t._v("蓝色")])],1)],1),t._v(" "),a("FormItem",{attrs:{label:"车辆类型",prop:"cartype"}},[a("Select",{model:{value:t.temp.cartype,callback:function(e){t.$set(t.temp,"cartype",e)},expression:"temp.cartype"}},[a("Option",{attrs:{value:"普通货车"}},[t._v("普通货车")]),t._v(" "),a("Option",{attrs:{value:"厢式货车"}},[t._v("厢式货车")]),t._v(" "),a("Option",{attrs:{value:"罐式货车"}},[t._v("罐式货车")]),t._v(" "),a("Option",{attrs:{value:"牵引车"}},[t._v("牵引车")]),t._v(" "),a("Option",{attrs:{value:"普通挂车"}},[t._v("普通挂车")]),t._v(" "),a("Option",{attrs:{value:"集装箱挂车"}},[t._v("集装箱挂车")]),t._v(" "),a("Option",{attrs:{value:"仓栅式货车"}},[t._v("仓栅式货车")]),t._v(" "),a("Option",{attrs:{value:"封闭货车"}},[t._v("封闭货车")]),t._v(" "),a("Option",{attrs:{value:"平板货车"}},[t._v("平板货车")]),t._v(" "),a("Option",{attrs:{value:"集装箱车"}},[t._v("集装箱车")]),t._v(" "),a("Option",{attrs:{value:"自卸货车"}},[t._v("自卸货车")]),t._v(" "),a("Option",{attrs:{value:"特殊结构货车"}},[t._v("特殊结构货车")]),t._v(" "),a("Option",{attrs:{value:"专项作业车"}},[t._v("专项作业车")]),t._v(" "),a("Option",{attrs:{value:"厢式挂车"}},[t._v("厢式挂车")]),t._v(" "),a("Option",{attrs:{value:"仓栅式挂车"}},[t._v("仓栅式挂车")]),t._v(" "),a("Option",{attrs:{value:"平板挂车"}},[t._v("平板挂车")]),t._v(" "),a("Option",{attrs:{value:"自卸挂车"}},[t._v("自卸挂车")]),t._v(" "),a("Option",{attrs:{value:"专项作业挂车"}},[t._v("专项作业挂车")]),t._v(" "),a("Option",{attrs:{value:"车辆运输车"}},[t._v("车辆运输车")]),t._v(" "),a("Option",{attrs:{value:"车辆运输车(单排)"}},[t._v("车辆运输车(单排)")])],1)],1),t._v(" "),a("FormItem",{attrs:{label:"最大载货吨数",prop:"maxload"}},[a("Input",{attrs:{placeholder:"最大载货吨数"},model:{value:t.temp.maxload,callback:function(e){t.$set(t.temp,"maxload",e)},expression:"temp.maxload"}})],1),t._v(" "),a("FormItem",{attrs:{label:"业户名称",prop:"businessname"}},[a("Input",{attrs:{placeholder:"业户名称"},model:{value:t.temp.businessname,callback:function(e){t.$set(t.temp,"businessname",e)},expression:"temp.businessname"}})],1),t._v(" "),a("FormItem",{attrs:{label:"业主电话"}},[a("Input",{attrs:{placeholder:"业主电话"},model:{value:t.temp.businesstel,callback:function(e){t.$set(t.temp,"businesstel",e)},expression:"temp.businesstel"}})],1),t._v(" "),a("FormItem",{attrs:{label:"品牌型号",prop:"brandmodel"}},[a("Input",{attrs:{placeholder:"品牌型号"},model:{value:t.temp.brandmodel,callback:function(e){t.$set(t.temp,"brandmodel",e)},expression:"temp.brandmodel"}})],1),t._v(" "),a("FormItem",{attrs:{label:"道路运输证号",prop:"roadtransportcertificate"}},[a("Input",{attrs:{placeholder:"道路运输证号"},model:{value:t.temp.roadtransportcertificate,callback:function(e){t.$set(t.temp,"roadtransportcertificate",e)},expression:"temp.roadtransportcertificate"}})],1),t._v(" "),a("FormItem",{attrs:{label:"满载重量",prop:"fullload"}},[a("Input",{attrs:{placeholder:"满载重量"},model:{value:t.temp.fullload,callback:function(e){t.$set(t.temp,"fullload",e)},expression:"temp.fullload"}})],1),t._v(" "),a("FormItem",{attrs:{label:"经营许可证号"}},[a("Input",{attrs:{placeholder:"经营许可证号"},model:{value:t.temp.businesslicense,callback:function(e){t.$set(t.temp,"businesslicense",e)},expression:"temp.businesslicense"}})],1),t._v(" "),a("FormItem",{attrs:{label:"车长",prop:"carlength"}},[a("Select",{model:{value:t.temp.carlength,callback:function(e){t.$set(t.temp,"carlength",e)},expression:"temp.carlength"}},[a("Option",{attrs:{value:4.2}},[t._v("4.2米")]),t._v(" "),a("Option",{attrs:{value:5}},[t._v("5米")]),t._v(" "),a("Option",{attrs:{value:6.2}},[t._v("6.2米")]),t._v(" "),a("Option",{attrs:{value:6.8}},[t._v("6.8米")]),t._v(" "),a("Option",{attrs:{value:7.2}},[t._v("7.2米")]),t._v(" "),a("Option",{attrs:{value:7.7}},[t._v("7.7米")]),t._v(" "),a("Option",{attrs:{value:7.8}},[t._v("7.8米")]),t._v(" "),a("Option",{attrs:{value:8.2}},[t._v("8.2米")]),t._v(" "),a("Option",{attrs:{value:8.7}},[t._v("8.7米")]),t._v(" "),a("Option",{attrs:{value:9.6}},[t._v("9.6米")]),t._v(" "),a("Option",{attrs:{value:11.5}},[t._v("11.5米")]),t._v(" "),a("Option",{attrs:{value:12.5}},[t._v("12.5米")]),t._v(" "),a("Option",{attrs:{value:13}},[t._v("13米")]),t._v(" "),a("Option",{attrs:{value:16}},[t._v("16米")]),t._v(" "),a("Option",{attrs:{value:17.5}},[t._v("17.5米")]),t._v(" "),a("Option",{attrs:{value:-1}},[t._v("其他")])],1)],1),t._v(" "),a("FormItem",{attrs:{label:"备注"}},[a("Input",{attrs:{type:"textarea",autosize:{minRows:2,maxRows:5},placeholder:"备注"},model:{value:t.temp.mark,callback:function(e){t.$set(t.temp,"mark",e)},expression:"temp.mark"}})],1),t._v(" "),a("FormItem",[a("div",{staticStyle:{display:"flex","flex-direction":"row","justify-content":"space-between"}},[a("Button",{staticClass:"button",attrs:{size:"large",type:"success"},on:{click:t.right}},[t._v("确定")]),t._v(" "),a("Button",{staticClass:"button",attrs:{size:"large",type:"info"},on:{click:t.cancel}},[t._v("取消")])],1)])],1)],1),t._v(" "),a("Modal",{attrs:{"ok-text":"删除","cancel-text":"取消","class-name":"vertical-center-modal"},on:{"on-ok":t.handleDelete},model:{value:t.deleteStatus,callback:function(e){t.deleteStatus=e},expression:"deleteStatus"}},[a("p",[t._v("确定删除吗")])])],1)},staticRenderFns:[]};var p=a("C7Lr")(s,o,!1,function(t){a("GVOH")},null,null);e.default=p.exports},"2MEy":function(t,e){},GVOH:function(t,e){}});