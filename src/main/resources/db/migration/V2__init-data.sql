-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- HÃ´te : 127.0.0.1
-- GÃ©nÃ©rÃ© le : jeu. 09 mars 2023 Ã  19:22
-- Version du serveur : 10.4.24-MariaDB
-- Version de PHP : 8.1.6

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de donnÃ©es : `zenerator`
--

--
-- DÃ©chargement des donnÃ©es de la table `etablissement_seq`
--

INSERT INTO `etablissement_seq` (`next_val`) VALUES
    (1);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial`
--

INSERT INTO `free_trial` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `date_free_trial`, `date_free_trial_deuxieme_rappel`, `date_free_trial_premier_rappel`, `link`, `nombre_student_abonne`, `nombre_student_present`, `nombre_student_total`, `reference`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `free_trial_configuration`, `free_trial_student_email_template`, `free_trial_student_whats_template`, `free_trial_teacher_email_template`, `free_trial_teacher_whats_template`, `level`, `statut_free_trial`, `teacher`) VALUES
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (1, 'admin', '2023-03-09 18:15:12', '', NULL, '2023-03-20 19:10:57', NULL, NULL, NULL, 0, 0, 0, 'ft1', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, NULL, 1, NULL, 1, 1, 1),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (2, 'admin', '2023-03-09 18:15:54', '', NULL, '2023-03-21 19:15:33', NULL, NULL, NULL, 0, 0, 0, 'ft2', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, NULL, 1, NULL, 1, 1, 1),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (3, 'admin', '2023-03-09 18:16:30', '', NULL, '2023-03-22 19:16:01', NULL, NULL, NULL, 0, 0, 0, 'ft3', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, NULL, 1, NULL, 2, 1, 1),
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           (4, 'admin', '2023-03-09 18:16:57', '', NULL, '2023-03-22 19:16:43', NULL, NULL, NULL, 0, 0, 0, 'ft4', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 1, NULL, 1, NULL, 2, 1, 1);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_configuration`
--

INSERT INTO `free_trial_configuration` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `date_application_debut`, `date_application_fin`, `nombre_student_max`, `nombre_student_min`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
    (1, 'admin', '2023-03-09 18:10:39', '', NULL, '2023-03-06 17:07:53', '2023-03-31 19:08:12', 10, 50, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_configuration_seq`
--

INSERT INTO `free_trial_configuration_seq` (`next_val`) VALUES
                                                            (2),
                                                            (2);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_detail`
--

INSERT INTO `free_trial_detail` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `abonne`, `date_envoi_email_message`, `date_envoiwhats_up_message`, `email_message_sent`, `presence`, `reference`, `whats_up_message_sent`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`, `free_trial`, `student`) VALUES
                                                                                                                                                                                                                                                                                                                                                      (1, 'admin', '2023-03-09 18:19:19', '', NULL, b'0', NULL, NULL, b'0', b'0', 'ftd1', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1, 2),
                                                                                                                                                                                                                                                                                                                                                      (2, 'admin', '2023-03-09 18:19:50', '', NULL, b'0', NULL, NULL, b'0', b'0', 'ftd2', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 3, 2),
                                                                                                                                                                                                                                                                                                                                                      (3, 'admin', '2023-03-09 18:20:14', '', NULL, b'0', NULL, NULL, b'0', b'0', 'ftd3', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2, 3),
                                                                                                                                                                                                                                                                                                                                                      (4, 'admin', '2023-03-09 18:20:31', '', NULL, b'0', NULL, NULL, b'0', b'0', 'ftd4', b'0', NULL, NULL, NULL, NULL, NULL, NULL, NULL, 4, 3);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_detail_seq`
--

INSERT INTO `free_trial_detail_seq` (`next_val`) VALUES
                                                     (5),
                                                     (5);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_seq`
--

INSERT INTO `free_trial_seq` (`next_val`) VALUES
                                              (5),
                                              (5);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_student_email_template`
--

INSERT INTO `free_trial_student_email_template` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `corps`, `object`, `source`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
    (1, 'admin', '2023-03-09 18:05:45', 'admin', '2023-03-09 18:07:31', 'Free trial student email template', 'Hello dear student', 'aitbelmehdikhaoula@gmail.com', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_student_email_template_seq`
--

INSERT INTO `free_trial_student_email_template_seq` (`next_val`) VALUES
                                                                     (2),
                                                                     (2);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_student_whats_template_seq`
--

INSERT INTO `free_trial_student_whats_template_seq` (`next_val`) VALUES
                                                                     (1),
                                                                     (1);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_teacher_email_template`
--

INSERT INTO `free_trial_teacher_email_template` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `corps`, `object`, `source`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
    (1, 'admin', '2023-03-09 18:07:09', '', NULL, 'Free trial teacher email template', 'Hello dear teacher', 'aitbelmehdikhaoula@gmail.com', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_teacher_email_template_seq`
--

INSERT INTO `free_trial_teacher_email_template_seq` (`next_val`) VALUES
                                                                     (2),
                                                                     (2);

--
-- DÃ©chargement des donnÃ©es de la table `free_trial_teacher_whats_template_seq`
--

INSERT INTO `free_trial_teacher_whats_template_seq` (`next_val`) VALUES
                                                                     (1),
                                                                     (1);

--
-- DÃ©chargement des donnÃ©es de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
                                                  (63),
                                                  (63),
                                                  (63);

--
-- DÃ©chargement des donnÃ©es de la table `level`
--

INSERT INTO `level` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `code`, `libelle`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
                                                                                                                                                                                        (1, 'admin', '2023-03-09 18:01:46', '', NULL, 'beginner', 'beginner', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                        (2, 'admin', '2023-03-09 18:03:57', '', NULL, 'advanced', 'advanced', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `level_seq`
--

INSERT INTO `level_seq` (`next_val`) VALUES
                                         (3),
                                         (3);

--
-- DÃ©chargement des donnÃ©es de la table `permission`
--

INSERT INTO `permission` (`id`, `name`) VALUES
                                            (1, 'FreeTrial.edit'),
                                            (2, 'FreeTrial.list'),
                                            (3, 'FreeTrial.view'),
                                            (4, 'FreeTrial.add'),
                                            (5, 'FreeTrial.delete'),
                                            (6, 'StatutFreeTrial.edit'),
                                            (7, 'StatutFreeTrial.list'),
                                            (8, 'StatutFreeTrial.view'),
                                            (9, 'StatutFreeTrial.add'),
                                            (10, 'StatutFreeTrial.delete'),
                                            (11, 'FreeTrialConfiguration.edit'),
                                            (12, 'FreeTrialConfiguration.list'),
                                            (13, 'FreeTrialConfiguration.view'),
                                            (14, 'FreeTrialConfiguration.add'),
                                            (15, 'FreeTrialConfiguration.delete'),
                                            (16, 'FreeTrialDetail.edit'),
                                            (17, 'FreeTrialDetail.list'),
                                            (18, 'FreeTrialDetail.view'),
                                            (19, 'FreeTrialDetail.add'),
                                            (20, 'FreeTrialDetail.delete'),
                                            (21, 'FreeTrialTeacherWhatsTemplate.edit'),
                                            (22, 'FreeTrialTeacherWhatsTemplate.list'),
                                            (23, 'FreeTrialTeacherWhatsTemplate.view'),
                                            (24, 'FreeTrialTeacherWhatsTemplate.add'),
                                            (25, 'FreeTrialTeacherWhatsTemplate.delete'),
                                            (26, 'Level.edit'),
                                            (27, 'Level.list'),
                                            (28, 'Level.view'),
                                            (29, 'Level.add'),
                                            (30, 'Level.delete'),
                                            (31, 'Teacher.edit'),
                                            (32, 'Teacher.list'),
                                            (33, 'Teacher.view'),
                                            (34, 'Teacher.add'),
                                            (35, 'Teacher.delete'),
                                            (36, 'Student.edit'),
                                            (37, 'Student.list'),
                                            (38, 'Student.view'),
                                            (39, 'Student.add'),
                                            (40, 'Student.delete'),
                                            (41, 'Services.edit'),
                                            (42, 'Services.list'),
                                            (43, 'Services.view'),
                                            (44, 'Services.add'),
                                            (45, 'Services.delete'),
                                            (46, 'FreeTrialStudentWhatsTemplate.edit'),
                                            (47, 'FreeTrialStudentWhatsTemplate.list'),
                                            (48, 'FreeTrialStudentWhatsTemplate.view'),
                                            (49, 'FreeTrialStudentWhatsTemplate.add'),
                                            (50, 'FreeTrialStudentWhatsTemplate.delete'),
                                            (51, 'FreeTrialTeacherEmailTemplate.edit'),
                                            (52, 'FreeTrialTeacherEmailTemplate.list'),
                                            (53, 'FreeTrialTeacherEmailTemplate.view'),
                                            (54, 'FreeTrialTeacherEmailTemplate.add'),
                                            (55, 'FreeTrialTeacherEmailTemplate.delete'),
                                            (56, 'FreeTrialStudentEmailTemplate.edit'),
                                            (57, 'FreeTrialStudentEmailTemplate.list'),
                                            (58, 'FreeTrialStudentEmailTemplate.view'),
                                            (59, 'FreeTrialStudentEmailTemplate.add'),
                                            (60, 'FreeTrialStudentEmailTemplate.delete');

--
-- DÃ©chargement des donnÃ©es de la table `roles_permissions`
--

INSERT INTO `roles_permissions` (`role_id`, `permission_id`) VALUES
                                                                 (61, 1),
                                                                 (61, 2),
                                                                 (61, 3),
                                                                 (61, 4),
                                                                 (61, 5),
                                                                 (61, 6),
                                                                 (61, 7),
                                                                 (61, 8),
                                                                 (61, 9),
                                                                 (61, 10),
                                                                 (61, 11),
                                                                 (61, 12),
                                                                 (61, 13),
                                                                 (61, 14),
                                                                 (61, 15),
                                                                 (61, 16),
                                                                 (61, 17),
                                                                 (61, 18),
                                                                 (61, 19),
                                                                 (61, 20),
                                                                 (61, 21),
                                                                 (61, 22),
                                                                 (61, 23),
                                                                 (61, 24),
                                                                 (61, 25),
                                                                 (61, 26),
                                                                 (61, 27),
                                                                 (61, 28),
                                                                 (61, 29),
                                                                 (61, 30),
                                                                 (61, 31),
                                                                 (61, 32),
                                                                 (61, 33),
                                                                 (61, 34),
                                                                 (61, 35),
                                                                 (61, 36),
                                                                 (61, 37),
                                                                 (61, 38),
                                                                 (61, 39),
                                                                 (61, 40),
                                                                 (61, 41),
                                                                 (61, 42),
                                                                 (61, 43),
                                                                 (61, 44),
                                                                 (61, 45),
                                                                 (61, 46),
                                                                 (61, 47),
                                                                 (61, 48),
                                                                 (61, 49),
                                                                 (61, 50),
                                                                 (61, 51),
                                                                 (61, 52),
                                                                 (61, 53),
                                                                 (61, 54),
                                                                 (61, 55),
                                                                 (61, 56),
                                                                 (61, 57),
                                                                 (61, 58),
                                                                 (61, 59),
                                                                 (61, 60);

--
-- DÃ©chargement des donnÃ©es de la table `role_app`
--

INSERT INTO `role_app` (`id`, `authority`, `created_at`, `updated_at`) VALUES
    (61, 'ROLE_ADMIN', NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `services_seq`
--

INSERT INTO `services_seq` (`next_val`) VALUES
                                            (1),
                                            (1);

--
-- DÃ©chargement des donnÃ©es de la table `statut_free_trial`
--

INSERT INTO `statut_free_trial` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `code`, `libelle`, `style`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
                                                                                                                                                                                                             (1, 'admin', '2023-03-09 17:45:43', '', NULL, 'init', 'init', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                                             (2, 'admin', '2023-03-09 17:45:59', '', NULL, 'closed', 'closed', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                                             (3, 'admin', '2023-03-09 17:47:01', '', NULL, 'first-email-sent', 'first-email-sent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                                             (4, 'admin', '2023-03-09 17:47:19', '', NULL, 'second-email-sent', 'second-email-sent', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                                             (5, 'admin', '2023-03-09 17:47:19', '', NULL, 'second-email-sent-retry', 'second-email-sent-retry', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `statut_free_trial_seq`
--

INSERT INTO `statut_free_trial_seq` (`next_val`) VALUES
                                                     (5),
                                                     (5);

--
-- DÃ©chargement des donnÃ©es de la table `student`
--

INSERT INTO `student` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `code`, `email`, `libelle`, `phone`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
                                                                                                                                                                                                            (2, 'admin', '2023-03-09 17:57:01', '', NULL, 'student2', 'khaoula.aitbelmehdi@edu.uca.ma', 'student2', '0627908006', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
                                                                                                                                                                                                            (3, 'admin', '2023-03-09 17:59:38', '', NULL, 'student3', 'k.aitbelmehdi7353@uca.ac.ma', 'student3', '0627908006', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `student_seq`
--

INSERT INTO `student_seq` (`next_val`) VALUES
                                           (4),
                                           (4);

--
-- DÃ©chargement des donnÃ©es de la table `teacher`
--

INSERT INTO `teacher` (`id`, `createdby`, `createdon`, `updatedby`, `updatedon`, `code`, `email`, `libelle`, `phone`, `action_type`, `data`, `date`, `object_id`, `object_name`, `user_id`, `username`) VALUES
    (1, 'admin', '2023-03-09 17:55:04', '', NULL, 'teacher1', 'zouani.younes@gmail.com', 'teacher1', '0625495187', NULL, NULL, NULL, NULL, NULL, NULL, NULL);

--
-- DÃ©chargement des donnÃ©es de la table `teacher_seq`
--

INSERT INTO `teacher_seq` (`next_val`) VALUES
                                           (2),
                                           (2);

--
-- DÃ©chargement des donnÃ©es de la table `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
    (62, 61);

--
-- DÃ©chargement des donnÃ©es de la table `user_app`
--

INSERT INTO `user_app` (`id`, `account_non_expired`, `account_non_locked`, `created_at`, `credentials_non_expired`, `email`, `enabled`, `nom`, `password`, `password_changed`, `prenom`, `updated_at`, `username`, `etablissement`) VALUES
    (62, b'1', b'1', '2023-03-09 17:15:08', b'1', 'admin', b'1', 'admin', '$2a$10$e2.kWzmgPmFRKsYeL6295.J9nbTu2530EHn6bj2lnpsnY.nXtDd.C', b'0', 'admin', NULL, 'admin', NULL);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
