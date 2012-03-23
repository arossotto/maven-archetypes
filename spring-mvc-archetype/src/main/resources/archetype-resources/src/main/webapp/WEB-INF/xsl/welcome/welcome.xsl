<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:template match="/">
<html>
	<head>
		<link rel="stylesheet" href="../css/style.css" type="text/css"/>
	</head>
	<body>
		<h1>hello <xsl:value-of select="/username"/></h1>
	</body>
</html>
	</xsl:template>

</xsl:stylesheet> 