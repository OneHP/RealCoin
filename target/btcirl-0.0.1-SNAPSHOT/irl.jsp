<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<META name="description"content="The real value of Bitcoins being traded right now">
<META name="keywords"content="bitcoin,btc,virtual currency,crypto currency">
<!DOCTYPE html>
<head>
	<script type="text/javascript">
	  var _gaq = _gaq || [];
	  _gaq.push(['_setAccount', 'UA-18613157-4']);
	  _gaq.push(['_trackPageview']);
	  (function() {
	    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
	    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
	    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
	  })();
	</script>
	<title>Real Coin</title>
	<style>
		body{
			background-color:#EEEEEE;
			font-family:"Helvetica";
		}
		h1{
			font-size: 48px;
			vertical-align:absbottom; 
			display:inline;
			padding: 0px 10px 0px 0px;
		}
		h2{
			vertical-align:absbottom; 
			display:inline;
			color:#777777;
		}
		.headings{
			margin: 0px 10% 20px 10%;
			text-align:center;
			width: 80%;
		}
		.item{
			font-size:20px;
			margin: 0px 10% 0px 10%;
			padding: 5px;
			background-color:white;
			-webkit-border-radius: 10px;
			-moz-border-radius: 10px;
			-o-border-radius: 10px;
			-ms-border-radius: 10px;
			-khtml-border-radius: 10px;
			border-radius: 10px;
			border-style:solid;
			border-width: 1px;
			border-color: black;
			width: 80%;
		}
		.outerItem{
			background-color:#FF9966;
			filter: progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF9966', endColorstr='#FF9900'); /* for IE */
			-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#FF9966', endColorstr='#FF9900')"; /* for IE */
			background: -webkit-gradient(linear, left top, left bottom, from(#FF9966), to(#FF9900)); /* for webkit browsers */
			background: -moz-linear-gradient(top,  #FF9966,  #FF9900); /* for firefox 3.6+ */
			padding: 7px 7px 7px 7px;
			margin: 0px 7px 7px 7px; 
		}
		.container{
			margin: 0px 20% 0px 20%;
			background-color:white;
			-webkit-border-radius: 10px;
			-moz-border-radius: 10px;
			-o-border-radius: 10px;
			-ms-border-radius: 10px;
			-khtml-border-radius: 10px;
			border-radius: 10px;
			border-style:solid;
			border-width: 1px;
			border-color: black;
			width: 60%;
		}
		.footer{
			font-size: 12px;
			color:#777777;
			text-align:center;
			margin: auto;
			width: 70%;
		}
	</style>
</head>
<body>
	<div class=container>
		<br />
		<div>
			<div class=headings><h1>Real Coin</h1><h2>The real value of Bitcoins being traded right now</h2></div>
			<c:forEach items="${transactions}" var="transaction">
				<div class=outerItem>
					<div class=item>Someone just traded some Bitcoins for $${transaction.value}, enough to buy ${transaction.irl}</div>
				</div>
			</c:forEach>
		</div>
		<br />
	</div>
	<br />
	<div class=footer>Displaying the last five Bitcoin transactions from the exchange at <a href="https://mtgox.com">MtGox</a>. Updated every minute.</div>
	<div class=footer>Like this site? Send me some coins 1B2vFeUxZ4GjvJUsfCGBxppDVdd68VLEab</div>
</body>
