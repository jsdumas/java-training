<%@ taglib prefix="s" uri="/struts-tags"%>

<s:include value="header.jsp">
	<s:param value="Identification r�ussie" name="title" />
</s:include>


<div class="alert alert-success">
	<s:actionmessage />
</div>

<a href="personneList">List de personnes</a>

<s:include value="footer.jsp" />