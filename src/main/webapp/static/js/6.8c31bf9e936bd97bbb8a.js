webpackJsonp([6],{"4yuK":function(e,t){},DpWN:function(e,t,s){"use strict";Object.defineProperty(t,"__esModule",{value:!0});var n=s("aozt"),r=s.n(n),o=s("YaEn"),a={name:"Login",components:{IndexTitle:s("TrHK").a},data:function(){return{formInline:{no:"",password:""},ruleInline:{no:[{required:!0,message:"请输入用户名",trigger:"blur"}],password:[{required:!0,message:"请输入密码",trigger:"blur"},{type:"string",min:6,message:"密码最小6位",trigger:"blur"}]}}},router:o.a,methods:{handleSubmit:function(e){var t=this;this.$refs[e].validate(function(e){e?r.a.post("/api/register.json",t.formInline).then(t.registerSuccess):t.$Message.error("请输入信息")})},registerSuccess:function(e){console.log(e);this.no;e.data.ret&&o.a.push({path:"/"})}}},l={render:function(){var e=this,t=e.$createElement,s=e._self._c||t;return s("div",{staticClass:"box"},[s("IndexTitle"),e._v(" "),s("Row",{staticClass:"loginForm"},[s("Col",{attrs:{span:"12",offset:"6"}},[s("Form",{ref:"formInline",attrs:{model:e.formInline,rules:e.ruleInline}},[s("Row",[s("Col",{attrs:{xs:{span:24,offset:0},sm:{span:18,offset:3},md:{span:16,offset:4},lg:{span:14,offset:5}}},[s("FormItem",{attrs:{prop:"no"}},[s("Input",{attrs:{size:"large",type:"text",clearable:"",placeholder:"Username"},model:{value:e.formInline.no,callback:function(t){e.$set(e.formInline,"no",t)},expression:"formInline.no"}},[s("Icon",{attrs:{slot:"prepend",type:"ios-person-outline"},slot:"prepend"})],1)],1)],1)],1),e._v(" "),s("Row",[s("Col",{attrs:{xs:{span:24,offset:0},sm:{span:18,offset:3},md:{span:16,offset:4},lg:{span:14,offset:5}}},[s("FormItem",{attrs:{prop:"password"}},[s("Input",{attrs:{size:"large",type:"password",clearable:"",placeholder:"Password"},model:{value:e.formInline.password,callback:function(t){e.$set(e.formInline,"password",t)},expression:"formInline.password"}},[s("Icon",{attrs:{slot:"prepend",type:"ios-lock-outline"},slot:"prepend"})],1)],1)],1)],1),e._v(" "),s("Row",[s("Col",{attrs:{xs:{span:24,offset:0},sm:{span:18,offset:3},md:{span:16,offset:4},lg:{span:14,offset:5}}},[s("FormItem",[s("Button",{staticClass:"button",attrs:{size:"large",type:"primary"},on:{click:function(t){e.handleSubmit("formInline")}}},[e._v("注册")])],1)],1)],1)],1)],1)],1)],1)},staticRenderFns:[]};var i=s("C7Lr")(a,l,!1,function(e){s("InIH")},"data-v-18725106",null);t.default=i.exports},InIH:function(e,t){},TrHK:function(e,t,s){"use strict";var n={name:"Title",props:{status:Boolean}},r={render:function(){var e=this.$createElement,t=this._self._c||e;return t("Row",{staticClass:"title-header"},[t("Col",{attrs:{span:"4",offset:"8"}},[t("router-link",{class:{active:!this.status},attrs:{to:"/"}},[this._v("\n      登录\n    ")])],1),this._v(" "),t("Col",{attrs:{span:"4"}},[t("router-link",{class:{active:this.status},attrs:{to:"register"}},[this._v("\n      注册\n    ")])],1)],1)},staticRenderFns:[]};var o=s("C7Lr")(n,r,!1,function(e){s("4yuK")},"data-v-397e17f6",null);t.a=o.exports}});