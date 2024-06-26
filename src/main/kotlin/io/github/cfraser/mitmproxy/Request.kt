/*
Copyright 2022 c-fraser

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    https://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.github.cfraser.mitmproxy

import java.net.URI

/**
 * [Request] is the HTTP request to be proxied.
 *
 * @property uri the proxy request [URI]
 * @property method the proxy request method
 * @property headers the proxy request headers
 * @property body the proxy request body
 */
class Request(
    @JvmField var uri: URI,
    @JvmField var method: String,
    @JvmField var headers: Map<String, String>,
    @JvmField var body: ByteArray?
) {

  override fun toString() = "$method $uri"
}
