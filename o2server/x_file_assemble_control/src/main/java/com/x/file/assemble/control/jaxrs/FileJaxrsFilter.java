package com.x.file.assemble.control.jaxrs;

import javax.servlet.annotation.WebFilter;

import com.x.base.core.project.jaxrs.AnonymousCipherManagerUserJaxrsFilter;

@WebFilter(urlPatterns = "/jaxrs/file/*", asyncSupported = true)
public class FileJaxrsFilter extends AnonymousCipherManagerUserJaxrsFilter {

}
