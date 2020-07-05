/*
 * Copyright 2020 Emory University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.emory.cs.algebraic;

/**
 * @author Jinho D. Choi
 */
public interface Numeral<T extends Numeral<T>> {
    /**
     * Adds `n` to this numeral.
     * @param n the numeral to be added.
     */
    void add(T n);

    /**
     * Multiplies `n` to this numeral.
     * @param n the numeral to be multiplied.
     */
    void multiply(T n);
}
