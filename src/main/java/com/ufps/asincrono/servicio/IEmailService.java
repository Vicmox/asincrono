/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ufps.asincrono.servicio;

import java.io.File;

/**
 *
 * @author PC
 */
public interface IEmailService {

    void sendEmail(String toUser, String subject, String message);

    void sendEmailWithFile(String toUser, String subject, String message, File file);
}
