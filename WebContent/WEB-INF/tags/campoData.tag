
<%@ tag language="java" pageEncoding="UTF-8"%>

<%@ attribute name="id" required="true" %>

<input type="text" id="${id}" name="${id}" />

<script>
<!-- montando a data com jquery -->

	$("#${id}").datepicker({dateFormart: 'dd/mm/yy'});

</script>