package com.exoplatform.samples.portlets;

/**
 * Created by exo on 28/01/15.
 */
import java.io.IOException;


import javax.portlet.GenericPortlet;

import javax.portlet.PortletRequestDispatcher;

import javax.portlet.RenderRequest;

import javax.portlet.RenderResponse;

import javax.portlet.PortletException;

import javax.portlet.RenderMode;


public class ForgetPasswordPortlet extends GenericPortlet {

  @RenderMode(name = "view")
  public void Hello(RenderRequest request, RenderResponse response) throws IOException, PortletException {

    PortletRequestDispatcher prDispatcher = getPortletContext().getRequestDispatcher("/portlets/jsp/forgetPassword.jsp");

    prDispatcher.include(request, response);

  }

}