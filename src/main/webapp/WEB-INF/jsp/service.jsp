<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,user-scalable=no" />
<meta name="applicable-device" content="mobile">
<meta content="yes" name="apple-mobile-web-app-capable" />
<meta content="black" name="apple-mobile-web-app-status-bar-style" />
<meta content="telephone=no" name="format-detection" />
<meta content="email=no" name="format-detection" />
<meta http-equiv="Expires" content="-1">
<meta http-equiv="Cache-Control" content="no-cache">
<meta http-equiv="Cache-Control" content="no-siteapp" />
<meta http-equiv="Cache-Control" content="no-transform" />
<meta http-equiv="Pragma" content="no-cache">
<script>
	!(function(doc, win) {
		var docEle = doc.documentElement, evt = "onorientationchange" in window ? "orientationchange"
				: "resize", fn = function() {
			var width = docEle.clientWidth;
			if (width > 768)
				width = 768;
			if (width < 320)
				width = 320;
			width && (docEle.style.fontSize = 100 * (width / 750) + "px");
		};
		win.addEventListener(evt, fn, false);
		doc.addEventListener("DOMContentLoaded", fn, false);
	}(document, window));
</script>
<title>居间服务合同</title>
<style>
* {
	margin: 0;
	padding: 0;
}

.cont {
	max-width: 768px;
	margin: 0 auto;
	min-width: 320px;
	padding-bottom: 30px;
}

.txt {
	padding: 20px 15px;
}

p {
	color: #333;
	font-size: 12px;
	line-height: 20px;
}

.indent p {
	text-indent: 24px;
}

.indent p.noIndent {
	text-indent: 0;
}

h4 {
	font-size: 16px;
	line-height: 22px;
	padding: 20px 0 0;
}

h1 {
	font-size: 20px;
	text-align: center;
}

p.right {
	text-align: right;
}

.center {
	text-align: center;
}

h3 {
	font-size: 18px;
	line-height: 22px;
	padding: 20px 0;
}

p {
	text-indent: 2em;
}

p span, h3 span, div.underline {
	text-decoration: underline;
}
</style>
</head>
<body>
	<%@include file="../common/include.jsp"%>
	<div class="cont">
		<div class="txt">
			<h1>《居间服务合同》</h1>

			<p class="right">合同编号：${contractNo}</p>

			<p>
				<span>特别提醒：在您确认签署本合同之前，请您务必仔细阅读本合同所有条款，特别是以粗体或下划线标注的条款。一旦您签署本合同，即意味着您已充分理解本合同所有条款的含义及相应的法律后果，同意与本合同其他方以数据电文形式订立本合同并接受本合同约束。</span>
			</p>

			<h3 class="center">
				<span>居间服务合同</span>
			</h3>

			<p>
				<span>合同签订地及履行地：北京市朝阳区</span>
			</p>
			<p>
				<span>合同签订日期：${date }</span>
			</p>
			<br>
			<p>用户（以下简称“借款人”）基本信息</p>
			<p>自然人姓名/单位名称：${userName }</p>
			<p>身份证号/统一社会信用代码：${identityNo }</p>
			<p>身份证住址/注册地址：</p>
			<p>趣生财钱包APP账户ID：${userId }</p>
			<p>联系电话：${mobileNumber }</p>
			<br>
			<p>服务方名称：北京联银信息技术有限公司</p>
			<p>统一社会信用代码：911101053579627479</p>
			<p>注册地址：北京市朝阳区十八里店乡周家庄村240号-1</p>

			<h4>鉴于：</h4>
			<p>1、服务方为趣生财钱包APP运营方，为借款人提供贷款消费平台服务；</p>
			<p>2、借款人为趣生财钱包APP注册用户；</p>
			<p>3、鉴于上述，经协商一致，各方达成如下内容，以资共同信守：</p>

			<h4>第一条 释义</h4>
			<p>1.1本合同：指《居间服务合同》及借款人在服务方运营的趣生财钱包APP注册账户、借款人在申请借款过程中同意的所有条款；</p>
			<p>1.2合同成立时间:指合同签订之日；</p>
			<p>1.3合同生效时间:指本合同自服务方审核通过后或您首次成功使用本合同中任一服务之时生效；</p>
			<p>1.4合同有效期间:指您持续使用本合同服务的期间；</p>
			<p>1.5期间:所有的期间均包括起止日期的当天；</p>
			<p>1.6数字:所有数字均包括本数；</p>
			<p>1.7个人信息：指可用于识别或用户身份和信用的信息，包括但不限于身份证信息、组织机构代码证、统一社会信用代码、电话联系方式、趣生财钱包APP账户注册信息、地理位置和电子通讯录等。</p>

			<h4>第二条 服务及服务费率</h4>
			<p>
				<span>2.1服务方向您提供如下服务（以下简称“本服务”）：</span>
			</p>
			<p>
				<span>2.1.1消费性信贷类融资服务；</span>
			</p>
			<p>
				<span>2.1.2借款分期服务；</span>
			</p>
			<p>
				<span>2.1.3居间服务：服务方根据其获取的借款人信息及信用评价决定为借款人借款提供居间服务，撮合借款人与一个或多个出借人达成借贷交易、签订借款协议；</span>
			</p>
			<p>
				<span>2.1.4信用审核服务：服务方将依据其获得的借款人基本信息及/或信用信息，按照其自行制定的审批标准对借款人及借款人特定的借款需求进行审核，对借款人的信用等级、资产状况及还款能力进行评估，并将该审核结论及评估分析结论展示给拟出借人，为借贷关系的形成提供信用依据。</span>
			</p>
			<p>
				<span>2.1.5账户管理服务：服务方根据借款人提交的个人信息，协助借款人在银行或相应支付机构处开立可单独核算的电子账户（下称“借款人账户”），该账户可用于基于借款人在平台上的相关操作而产生的所有资金的收支结算、向平台外借款人实名银行账户转出资金以及借款人指定的其他合法用途，并根据本协议项下的授权，委托银行或相应支付机构对借款方应支付各类款项（含本金、利息、罚息、服务费、违约金等）进行账户内资金的冻结或自动扣划。</span>
			</p>
			<p>
				<span>2.1.6针对上述服务的账单查询、展示及还款提醒。</span> <span>您同意，服务方有权基于业务发展及风险控制需要而单方面增加或减少乃至终止上述服务，但不会侵害您既有的合法权益。</span>
			</p>
			<p>
				<span>2.2借款人同意，服务方向您提供本合同项下服务而有权向您收取服务费。</span>
			</p>
			<p>
				2.3 <span>服务费：</span>借款总金额的4%，最低30元。借款人自收到借款之日一次性向服务方支付。即出借人将出借资金支付到借款人指定的收款账户的同时，借款人同意并认可将应付服务费通过银行或相应支付机构直接划扣至服务方指定账户。
			</p>
			<p>2.4 服务费为一次性费用，借款完成后，服务费均不予退还。</p>

			<h4>第三条 各方权利与义务</h4>
			<p>3.1借款人权利</p>
			<p>3.1.1借款人有权向服务方了解自己的信用评估进度和结果。</p>
			<p>3.2服务方权利</p>
			<p>3.2.1服务方有权向借款人一次性收取服务费；</p>
			<p>3.2.2服务方按照本合同的约定，为借款人分配资金出借方并管理出借资金、发放借款、回收及催收借款、划扣相关款项、解除本合同；受借款人的授权在借款人还款时从借款人的趣生财钱包APP绑定的银行卡账户或趣生财钱包APP账户余额或趣生财钱包APP理财产品账户中划扣相应的款项,
				无需另行经过借款人的同意或者提前通知借款人；</p>
			<p>3.2.3借款人同意并确认，服务方有权验证借款人提供的个人信息，包括但不限于身份证信息、趣生财钱包APP账户、地理位置和电子通讯录等信息；就借款人提供的个人信息及服务方通过合法渠道获取的与其相关的信息，包括但不限于身份证信息、趣生财钱包APP账户、地理位置和电子通讯录等信息，服务方有权为本合同目的自行管理并使用；</p>
			<p>3.2.4服务方有权根据对借款人信息和征信记录的审核情况决定是否代资金出借方发放借款；</p>
			<p>3.2.5借款人确认并同意，借款人不支付利息或不履行还款义务以及未完全履行前述义务时，服务方有权向资金出借方披露服务方所知晓的所有关于借款人的信息，同时服务方有权代资金出借方通过包括但不限于网络、报刊、电视、征信系统等方式向第三方披露借款人图像、姓名、手机号、身份证信息、逾期还款情况等信息。</p>
			<p>3.2.6
				用户确认并同意，如果在2.1.1和2.1.2的服务中，用户作为出借人的债权发生借款逾期或违约的情形，用户应当配合服务方办理债权转让手续，债权受让方由服务方指定，指定债权受让方按照原借款合同约定还本付息，支付完成后债权立即发生转移。如果需要用户提供电子签名办理债权转让、诉讼、仲裁，用户应当积极配合提供。</p>
			<p>3.3借款人义务：</p>
			<p>3.3.1借款人为符合中华人民共和国法律（即中国法律，不包括香港特别行政区、澳门特别行政区和台湾地区的法律法规）规定的而具有完全民事权利能力和民事行为能力，能独立行使和承担合同项下权利义务的自然人或依法设立并存续的法人、其他组织；</p>
			<p>3.3.2借款人在注册趣生财钱包APP账号和申请借款时提供的身份证信息、通讯地址、联系电话、紧急联络人（如有）等信息真实有效，如有变更，在变更后三日内书面通知服务方；</p>
			<p>3.3.3借款人应如实向服务方提供个人信息，并授权服务方或服务方指定的第三方渠道对该等个人信息进行验证，并授权服务方为本合同目的管理和使用该等个人信息。借款人应在所提供的个人信息被认定为虚假时承担所有后果和法律责任；</p>
			<p>3.3.4本合同有效期间，借款人如需向第三人提供担保的，须提前七日书面通知服务方。</p>
			<p>3.4 服务方义务：</p>
			<p>3.4.1服务方为符合中华人民共和国法律（即中国法律，不包括香港特别行政区、澳门特别行政区和台湾地区的法律法规）规定的能够独立行使和承担合同项下权利义务的法人，为借款人提供本合同项下服务；</p>
			<p>3.4.2服务方应当对借款人提供的信息审慎审核，对借款人的信用记录进行审查，并且对借款人授权的验证信息负有保密义务；如因相关权力部门（包括但不限于法院、仲裁机构、金融监管机构）要求或以法律强制要求，服务方有权不经借款人同意进行披露。</p>

			<h4>第四条 违约责任与救济</h4>
			<p>4.1借款人违反本合同项下任一约定的视为借款人违约。</p>
			<p>4.2
				借款人发生违约情形时，服务方有权对外披露借款人的违约信息，并要求借款人承担违约责任，包括但不限于赔偿服务方的全部损失。</p>

			<h4>第五条 服务方的免责</h4>
			<p>以下情形，服务方免责：</p>
			<p>5.1不是借款人本人操作，但是实际操作人提供的借款信息均为有效信息，且服务方在申请借款的各个环节均尽到了审慎的审查义务，由此给借款人及出借人带来的损失由实际操作人承担；</p>
			<p>5.2借款人拒不还款，且服务方披露了借款人的信息后难以追回借款的，服务方免责；</p>
			<p>5.3因为系统所依赖的趣生财钱包APP故障出现的问题和正常的服务器和维修与系统升级，服务方免责；</p>
			<p>5.4为有效提供服务，服务方支付门户、在线支付系统、趣生财钱包APP将不时进行维护和检测，对此服务方将提前公告，因此产生的服务中断或不稳定状态，不视为服务方违约；</p>
			<p>5.5本合同有效期内，因国家相关主管部门颁布、变更的法令、政策导致服务方不能提供约定服务的，不视为违约；</p>
			<p>5.6其他依法不应由服务方承担责任的情形。</p>

			<h4>第六条 合同变更、解除、终止和权利义务的转让</h4>
			<p>6.1 合同变更与解除</p>
			<p>6.1.1
				除本合同另有约定或双方协商同意，您不得要求单方变更或解除本合同。服务方基于自身经营考虑，可通过网上公示等通知送达方式提前宣布中断、终止本合同或其条款所涉服务，并要求您在指定期限内偿还本合同项下应付款项（如有）。</p>
			<p>6.2 合同提前终止</p>
			<p>您在使用本服务过程中，若有下列情形发生，您同意服务方有权终止提供服务，您应立即归还已产生但尚未支付的应付款项：</p>
			<p>6.2.1 您主动关闭本服务；</p>
			<p>6.2.2 您在本服务中使用的银行账户被注销；</p>
			<p>6.2.3 冒用他人名义、盗用他人账户使用本服务；</p>
			<p>6.2.4
				从事不法交易行为，如洗钱、贩卖枪支、毒品、禁药、盗版软件、黄色淫秽物品、其他监管机构、司法机构、服务方认为不得使用本服务进行交易的物品等；</p>
			<p>6.2.5 从事任何可能侵害本服务系统、资料之行为；</p>
			<p>6.2.6 服务方全部或部分终止为您提供服务；</p>
			<p>6.2.7 您的使用资格、条件无法满足本服务公开标准或要求的；</p>
			<p>6.2.8 违反任何法律法规、协议或规则的，其他违背本合同或本服务网站各项规则的情况。</p>
			<p>6.3 合同权利义务的转让</p>
			<p>未经服务方书面同意，您不得将本合同项下的权利和义务转让给任何第三方。服务方有权将其在本合同项下的权利和义务全部或部分转让给第三方，其转让行为无须征得您的同意，服务方将书面通知您该等转让行为。</p>

			<h4>第七条 其他</h4>
			<p>7.1本合同及附件中所称的“本服务网站”，系指由服务方旗下趣生财钱包APP项下的“POS贷”服务页面等组成。</p>
			<p>7.2服务方对本合同进行修改或增减/变更服务内容及方式的，将采取但不限于在趣生财钱包APP项下“POS贷”页面、服务方官方网站等对外发布公告，【自公告之日起45个自然日】后公告事项即生效；服务方提高服务价格或设立新的服务收费项目的，【自公告之日起3个月】后公告事项生效。借款人有权在公告期内选择是否同意本合同变更的内容。如对变更内容有异议应在公告期届满前提前终止使用本服务，并按照规定办理销户手续。服务方公布的在借款人申请以及分期付款间持续有效的公告（包括借款人签署对应借款合同之前以及之后发布的），均同样适用于借款人。如公告内容与借款人签署之借款合约不一致的以公告为准。</p>
			<p>7.3服务方可采用网站公告、对账单、信函、客户服务热线、预留手机短信、电子邮件等任一方式履行公告或告知义务。借款人同意接收服务方以信件、电子邮件、短信、彩信、电话等方式向其本人告知的与其业务相关的信息。</p>

			<h4>第八条 争议解决及法律适用</h4>
			<div class="underline">
				<p>8.1借款人同意与服务方在线订立本合同，适用于中华人民共和国法律，本合同在履行过程中就本协议条款或服务使用发生任何争议应先友好协商解决；协商不成的，您同意任何一方均应向【珠海仲裁委员会】提交仲裁申请并适用书面简易程序。仲裁裁决是终局的，对甲、乙双方均有约束力。</p>
				<p>对于因合同争议引起的任何纠纷借款人声明【珠海仲裁委员会】可以以手机短信或电子邮件等现代通讯方式或邮寄方式向借款人送达法律文书（包括仲裁文书）。</p>
				<p>8.2借款人指定接收法律文书的手机号码或电子邮箱为用于确认本合同的趣生财钱包APP账户绑定的手机号码或电子邮箱，司法机关向前述码址发出法律文书即视为送达。</p>
				<p>8.3借款人指定邮寄地址为借款人的身份证地址或营业执照住址。</p>
				<p>邮寄地址：</p>
				<p>联系电话：</p>
				<p>8.4借款人同意【珠海仲裁委员会】可采取以上一种或多种送达方式向借款人送达法律文书，【珠海仲裁委员会】采取多种方式向借款人送达法律文书，送达时间以上述送达方式中最先送达的为准。【珠海仲裁委员会】及司法机关向上述地址发送仲裁和诉讼法律文书，即视为有效送达。</p>
				<p>8.5借款人确认的上述送达方式适用于仲裁各个阶段。</p>
				<p>8.6若借款人上述送达地址有变更，借款人应当及时告知服务方和司法机关（如适用）变更后的送达地址。</p>
				<p>8.7若借款人任意提出异议进而使纠纷进入仲裁程序，在仲裁最终裁决借款人承担责任的情况下，因此产生的所有费用（包括但不限于律师费、诉讼费），均由借款人承担。</p>
				<p>8.8借款人已阅读本确认书所有条款，并保证上述送达地址是准确、有效的；如果提供的送达地址不确切，或不及时告知变更后的地址，使法律文书无法送达或未及时送达，借款人自行承担由此可能产生的法律后果。</p>
			</div>
			<p>(以下无内容）</p>
			<p>
				<br />
			</p>
			<p class="noIndent">出借人（签字/盖章）:${userName }</p>
			<p class="noIndent">${date }</p>
			<p>
				<br />
			</p>
			<p class="noIndent">平台方（签字/盖章）:北京联银信息技术有限公司</p>
			<p>签章处：</p>
			<p class="noIndent">${date }</p>
		</div>
	</div>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/js/zepto.min.js?v=<%=Math.random()%>"></script>
	<script type="text/javascript"
		src="${pageContext.request.contextPath}/static/js/fastclick.min.js?v=<%=Math.random()%>"></script>
	<script>
		$(function() {
			FastClick.attach(document.body);
		});
	</script>
</body>
</html>