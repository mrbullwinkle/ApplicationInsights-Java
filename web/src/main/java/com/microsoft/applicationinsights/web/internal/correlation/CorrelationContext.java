/*
 * ApplicationInsights-Java
 * Copyright (c) Microsoft Corporation
 * All rights reserved.
 *
 * MIT License
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the ""Software""), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify, merge,
 * publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE
 * FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 */

package com.microsoft.applicationinsights.web.internal.correlation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Class responsible to store the correlation context information.
 */
public class CorrelationContext {

    /**
     * Stores the contents of Correlation-Context headers found in the incoming request.
     */
    private final ArrayList<String> incomingHeaderValues;


    /**
     * Stores the correlation context as mappings.
     */
    private final HashMap<String, String> mappings; 

    public CorrelationContext() {
        this.incomingHeaderValues = new ArrayList<String>();
        this.mappings = new HashMap<String, String>();
    }

    public HashMap<String, String> getMappings() {
        return this.mappings;
    }

    public ArrayList<String> getHeaderValues() {
        return this.incomingHeaderValues;
    }
}