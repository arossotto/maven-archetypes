<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
<html>
	<head>
		<link rel="stylesheet" href="../css/style.css" type="text/css"/>
	</head>
	<body>
		<form id="loginBox" action="checkCredential.do" method="post">
			<div id="usernameBox">
				<div class="label">username</div>
				<div>
					<input type="text" name="username"/>
				</div>
			</div>
			<div id="passwordBox">
				<div class="label">password</div>
				<div>
					<input type="password" name="password" />
				</div>
			</div>
			<div id="submitBox">
				<div class="label">login</div>
				<div>
					<input type="submit" value="login" />
				</div>
			</div>
		</form>
	</body>
</html>
	</xsl:template>

</xsl:stylesheet> 