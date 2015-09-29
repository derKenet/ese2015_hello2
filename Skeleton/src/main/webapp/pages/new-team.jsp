<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<c:import url="template/header.jsp" />


<h1>Create Team</h1>


<form:form method="post" modelAttribute="teamForm" action="createTeam" id="teamForm" cssClass="form-horizontal"  autocomplete="off">
    <fieldset>
        <legend>Choose Team Name</legend>

        <c:set var="teamErrors"><form:errors path="teamName"/></c:set>
        <div class="control-group<c:if test="${not empty teamErrors}"> error</c:if>">
            <label class="control-label" for="field-teamName">Team</label>

            <div class="controls">
                <form:input path="teamName" id="field-teamName" tabindex="1" maxlength="45" placeholder="Teamname"/>
                <form:errors path="teamName" cssClass="help-inline" element="span"/>
            </div>
        </div>
        
        <div class="form-actions">
            <button type="submit" class="btn btn-primary">Sign up</button>
            <button type="button" class="btn">Cancel</button>
        </div>
    </fieldset>
</form:form>




	<c:if test="${page_error != null }">
        <div class="alert alert-error">
            <button type="button" class="close" data-dismiss="alert">&times;</button>
            <h4>Error!</h4>
                ${page_error}
        </div>
    </c:if>


<c:import url="template/footer.jsp" />
