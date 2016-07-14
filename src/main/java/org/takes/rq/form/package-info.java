/**
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2016 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/**
 * This package contains implementations of the interface
 * {@link org.takes.rq.RqForm}.
 *
 * <p>{@link org.takes.rq.RqForm} implementations can parse FORM data in
 * {@code application/x-www-form-urlencoded} format (RFC 1738) from
 * {@link org.takes.Request} objects.
 *
 * <p>All implementations of this interface must be immutable and thread-safe.
 *
 * <p>Current implementations:
 * {@link org.takes.rq.form.RqFormBase} base implementation;
 * {@link org.takes.rq.form.RqFormFake} implementation that useful for
 * testing purposes. You can add your parameters in constructor;
 * {@link org.takes.rq.form.RqFormSmart} decorator with extra features:
 * Get single parameter and, if parameter not exists use default value or
 * throw HTTP exception.
 *
 * <p>Also please look at usage examples:
 *
 * @author Rui Castro (rui.castro@gmail.com)
 * @version $Id$
 * @since 0.33
 */
package org.takes.rq.form;
