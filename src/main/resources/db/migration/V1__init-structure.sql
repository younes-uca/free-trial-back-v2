-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- HÃ´te : 127.0.0.1
-- GÃ©nÃ©rÃ© le : lun. 13 mars 2023 Ã  12:08
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

-- --------------------------------------------------------

--
-- Structure de la table `etablissement`
--

CREATE TABLE `etablissement` (
                                 `id` bigint(20) NOT NULL,
                                 `createdby` varchar(255) DEFAULT NULL,
                                 `createdon` datetime DEFAULT NULL,
                                 `updatedby` varchar(255) DEFAULT NULL,
                                 `updatedon` datetime DEFAULT NULL,
                                 `code` varchar(255) DEFAULT NULL,
                                 `libelle` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `etablissement_seq`
--

CREATE TABLE `etablissement_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial`
--

CREATE TABLE `free_trial` (
                              `id` bigint(20) NOT NULL,
                              `createdby` varchar(255) DEFAULT NULL,
                              `createdon` datetime DEFAULT NULL,
                              `updatedby` varchar(255) DEFAULT NULL,
                              `updatedon` datetime DEFAULT NULL,
                              `date_free_trial` datetime DEFAULT NULL,
                              `date_free_trial_deuxieme_rappel` datetime DEFAULT NULL,
                              `date_free_trial_premier_rappel` datetime DEFAULT NULL,
                              `email_teacher_sending_date` datetime DEFAULT NULL,
                              `email_teacher_sent` bit(1) NOT NULL,
                              `link` varchar(255) DEFAULT NULL,
                              `nombre_student_abonne` int(11) DEFAULT NULL,
                              `nombre_student_present` int(11) DEFAULT NULL,
                              `nombre_student_total` int(11) DEFAULT NULL,
                              `reference` varchar(255) DEFAULT NULL,
                              `whats_teacher_sending_date` datetime DEFAULT NULL,
                              `whats_teacher_sent` bit(1) NOT NULL,
                              `action_type` varchar(255) DEFAULT NULL,
                              `data` varchar(255) DEFAULT NULL,
                              `date` datetime DEFAULT NULL,
                              `object_id` bigint(20) DEFAULT NULL,
                              `object_name` varchar(255) DEFAULT NULL,
                              `user_id` bigint(20) DEFAULT NULL,
                              `username` varchar(255) DEFAULT NULL,
                              `free_trial_configuration` bigint(20) DEFAULT NULL,
                              `free_trial_student_email_template` bigint(20) DEFAULT NULL,
                              `free_trial_student_whats_template` bigint(20) DEFAULT NULL,
                              `free_trial_teacher_email_template` bigint(20) DEFAULT NULL,
                              `free_trial_teacher_whats_template` bigint(20) DEFAULT NULL,
                              `level` bigint(20) DEFAULT NULL,
                              `statut_free_trial` bigint(20) DEFAULT NULL,
                              `teacher` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_configuration`
--

CREATE TABLE `free_trial_configuration` (
                                            `id` bigint(20) NOT NULL,
                                            `createdby` varchar(255) DEFAULT NULL,
                                            `createdon` datetime DEFAULT NULL,
                                            `updatedby` varchar(255) DEFAULT NULL,
                                            `updatedon` datetime DEFAULT NULL,
                                            `date_application_debut` datetime DEFAULT NULL,
                                            `date_application_fin` datetime DEFAULT NULL,
                                            `nombre_student_max` int(11) DEFAULT NULL,
                                            `nombre_student_min` int(11) DEFAULT NULL,
                                            `action_type` varchar(255) DEFAULT NULL,
                                            `data` varchar(255) DEFAULT NULL,
                                            `date` datetime DEFAULT NULL,
                                            `object_id` bigint(20) DEFAULT NULL,
                                            `object_name` varchar(255) DEFAULT NULL,
                                            `user_id` bigint(20) DEFAULT NULL,
                                            `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_configuration_seq`
--

CREATE TABLE `free_trial_configuration_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_detail`
--

CREATE TABLE `free_trial_detail` (
                                     `id` bigint(20) NOT NULL,
                                     `createdby` varchar(255) DEFAULT NULL,
                                     `createdon` datetime DEFAULT NULL,
                                     `updatedby` varchar(255) DEFAULT NULL,
                                     `updatedon` datetime DEFAULT NULL,
                                     `abonne` bit(1) DEFAULT NULL,
                                     `date_envoi_email_message` datetime DEFAULT NULL,
                                     `date_envoiwhats_up_message` datetime DEFAULT NULL,
                                     `email_message_sent` bit(1) DEFAULT NULL,
                                     `presence` bit(1) DEFAULT NULL,
                                     `reference` varchar(255) DEFAULT NULL,
                                     `whats_up_message_sent` bit(1) DEFAULT NULL,
                                     `action_type` varchar(255) DEFAULT NULL,
                                     `data` varchar(255) DEFAULT NULL,
                                     `date` datetime DEFAULT NULL,
                                     `object_id` bigint(20) DEFAULT NULL,
                                     `object_name` varchar(255) DEFAULT NULL,
                                     `user_id` bigint(20) DEFAULT NULL,
                                     `username` varchar(255) DEFAULT NULL,
                                     `free_trial` bigint(20) DEFAULT NULL,
                                     `student` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_detail_seq`
--

CREATE TABLE `free_trial_detail_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_seq`
--

CREATE TABLE `free_trial_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_student_email_template`
--

CREATE TABLE `free_trial_student_email_template` (
                                                     `id` bigint(20) NOT NULL,
                                                     `createdby` varchar(255) DEFAULT NULL,
                                                     `createdon` datetime DEFAULT NULL,
                                                     `updatedby` varchar(255) DEFAULT NULL,
                                                     `updatedon` datetime DEFAULT NULL,
                                                     `corps` varchar(255) DEFAULT NULL,
                                                     `object` varchar(255) DEFAULT NULL,
                                                     `source` varchar(255) DEFAULT NULL,
                                                     `action_type` varchar(255) DEFAULT NULL,
                                                     `data` varchar(255) DEFAULT NULL,
                                                     `date` datetime DEFAULT NULL,
                                                     `object_id` bigint(20) DEFAULT NULL,
                                                     `object_name` varchar(255) DEFAULT NULL,
                                                     `user_id` bigint(20) DEFAULT NULL,
                                                     `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_student_email_template_seq`
--

CREATE TABLE `free_trial_student_email_template_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_student_whats_template`
--

CREATE TABLE `free_trial_student_whats_template` (
                                                     `id` bigint(20) NOT NULL,
                                                     `createdby` varchar(255) DEFAULT NULL,
                                                     `createdon` datetime DEFAULT NULL,
                                                     `updatedby` varchar(255) DEFAULT NULL,
                                                     `updatedon` datetime DEFAULT NULL,
                                                     `corps` varchar(255) DEFAULT NULL,
                                                     `object` varchar(255) DEFAULT NULL,
                                                     `source` varchar(255) DEFAULT NULL,
                                                     `action_type` varchar(255) DEFAULT NULL,
                                                     `data` varchar(255) DEFAULT NULL,
                                                     `date` datetime DEFAULT NULL,
                                                     `object_id` bigint(20) DEFAULT NULL,
                                                     `object_name` varchar(255) DEFAULT NULL,
                                                     `user_id` bigint(20) DEFAULT NULL,
                                                     `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_student_whats_template_seq`
--

CREATE TABLE `free_trial_student_whats_template_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_teacher_email_template`
--

CREATE TABLE `free_trial_teacher_email_template` (
                                                     `id` bigint(20) NOT NULL,
                                                     `createdby` varchar(255) DEFAULT NULL,
                                                     `createdon` datetime DEFAULT NULL,
                                                     `updatedby` varchar(255) DEFAULT NULL,
                                                     `updatedon` datetime DEFAULT NULL,
                                                     `corps` varchar(255) DEFAULT NULL,
                                                     `object` varchar(255) DEFAULT NULL,
                                                     `source` varchar(255) DEFAULT NULL,
                                                     `action_type` varchar(255) DEFAULT NULL,
                                                     `data` varchar(255) DEFAULT NULL,
                                                     `date` datetime DEFAULT NULL,
                                                     `object_id` bigint(20) DEFAULT NULL,
                                                     `object_name` varchar(255) DEFAULT NULL,
                                                     `user_id` bigint(20) DEFAULT NULL,
                                                     `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_teacher_email_template_seq`
--

CREATE TABLE `free_trial_teacher_email_template_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_teacher_whats_template`
--

CREATE TABLE `free_trial_teacher_whats_template` (
                                                     `id` bigint(20) NOT NULL,
                                                     `createdby` varchar(255) DEFAULT NULL,
                                                     `createdon` datetime DEFAULT NULL,
                                                     `updatedby` varchar(255) DEFAULT NULL,
                                                     `updatedon` datetime DEFAULT NULL,
                                                     `corps` varchar(255) DEFAULT NULL,
                                                     `object` varchar(255) DEFAULT NULL,
                                                     `source` varchar(255) DEFAULT NULL,
                                                     `action_type` varchar(255) DEFAULT NULL,
                                                     `data` varchar(255) DEFAULT NULL,
                                                     `date` datetime DEFAULT NULL,
                                                     `object_id` bigint(20) DEFAULT NULL,
                                                     `object_name` varchar(255) DEFAULT NULL,
                                                     `user_id` bigint(20) DEFAULT NULL,
                                                     `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `free_trial_teacher_whats_template_seq`
--

CREATE TABLE `free_trial_teacher_whats_template_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `level`
--

CREATE TABLE `level` (
                         `id` bigint(20) NOT NULL,
                         `createdby` varchar(255) DEFAULT NULL,
                         `createdon` datetime DEFAULT NULL,
                         `updatedby` varchar(255) DEFAULT NULL,
                         `updatedon` datetime DEFAULT NULL,
                         `code` varchar(255) DEFAULT NULL,
                         `libelle` varchar(255) DEFAULT NULL,
                         `action_type` varchar(255) DEFAULT NULL,
                         `data` varchar(255) DEFAULT NULL,
                         `date` datetime DEFAULT NULL,
                         `object_id` bigint(20) DEFAULT NULL,
                         `object_name` varchar(255) DEFAULT NULL,
                         `user_id` bigint(20) DEFAULT NULL,
                         `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `level_seq`
--

CREATE TABLE `level_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `permission`
--

CREATE TABLE `permission` (
                              `id` bigint(20) NOT NULL,
                              `name` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `roles_permissions`
--

CREATE TABLE `roles_permissions` (
                                     `role_id` bigint(20) NOT NULL,
                                     `permission_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `role_app`
--

CREATE TABLE `role_app` (
                            `id` bigint(20) NOT NULL,
                            `authority` varchar(255) DEFAULT NULL,
                            `created_at` datetime DEFAULT NULL,
                            `updated_at` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `services`
--

CREATE TABLE `services` (
                            `id` bigint(20) NOT NULL,
                            `createdby` varchar(255) DEFAULT NULL,
                            `createdon` datetime DEFAULT NULL,
                            `updatedby` varchar(255) DEFAULT NULL,
                            `updatedon` datetime DEFAULT NULL,
                            `actif` bit(1) DEFAULT NULL,
                            `etablissement_id` bigint(20) DEFAULT NULL,
                            `hl7` varchar(255) DEFAULT NULL,
                            `ordre` bigint(20) DEFAULT NULL,
                            `code` varchar(255) DEFAULT NULL,
                            `description` varchar(255) DEFAULT NULL,
                            `libelle` varchar(255) DEFAULT NULL,
                            `action_type` varchar(255) DEFAULT NULL,
                            `data` varchar(255) DEFAULT NULL,
                            `date` datetime DEFAULT NULL,
                            `object_id` bigint(20) DEFAULT NULL,
                            `object_name` varchar(255) DEFAULT NULL,
                            `user_id` bigint(20) DEFAULT NULL,
                            `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `services_seq`
--

CREATE TABLE `services_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `statut_free_trial`
--

CREATE TABLE `statut_free_trial` (
                                     `id` bigint(20) NOT NULL,
                                     `createdby` varchar(255) DEFAULT NULL,
                                     `createdon` datetime DEFAULT NULL,
                                     `updatedby` varchar(255) DEFAULT NULL,
                                     `updatedon` datetime DEFAULT NULL,
                                     `code` varchar(255) DEFAULT NULL,
                                     `libelle` varchar(255) DEFAULT NULL,
                                     `style` varchar(255) DEFAULT NULL,
                                     `action_type` varchar(255) DEFAULT NULL,
                                     `data` varchar(255) DEFAULT NULL,
                                     `date` datetime DEFAULT NULL,
                                     `object_id` bigint(20) DEFAULT NULL,
                                     `object_name` varchar(255) DEFAULT NULL,
                                     `user_id` bigint(20) DEFAULT NULL,
                                     `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `statut_free_trial_seq`
--

CREATE TABLE `statut_free_trial_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `student`
--

CREATE TABLE `student` (
                           `id` bigint(20) NOT NULL,
                           `createdby` varchar(255) DEFAULT NULL,
                           `createdon` datetime DEFAULT NULL,
                           `updatedby` varchar(255) DEFAULT NULL,
                           `updatedon` datetime DEFAULT NULL,
                           `code` varchar(255) DEFAULT NULL,
                           `email` varchar(255) DEFAULT NULL,
                           `libelle` varchar(255) DEFAULT NULL,
                           `phone` varchar(255) DEFAULT NULL,
                           `action_type` varchar(255) DEFAULT NULL,
                           `data` varchar(255) DEFAULT NULL,
                           `date` datetime DEFAULT NULL,
                           `object_id` bigint(20) DEFAULT NULL,
                           `object_name` varchar(255) DEFAULT NULL,
                           `user_id` bigint(20) DEFAULT NULL,
                           `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `student_seq`
--

CREATE TABLE `student_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `teacher`
--

CREATE TABLE `teacher` (
                           `id` bigint(20) NOT NULL,
                           `createdby` varchar(255) DEFAULT NULL,
                           `createdon` datetime DEFAULT NULL,
                           `updatedby` varchar(255) DEFAULT NULL,
                           `updatedon` datetime DEFAULT NULL,
                           `code` varchar(255) DEFAULT NULL,
                           `email` varchar(255) DEFAULT NULL,
                           `libelle` varchar(255) DEFAULT NULL,
                           `phone` varchar(255) DEFAULT NULL,
                           `action_type` varchar(255) DEFAULT NULL,
                           `data` varchar(255) DEFAULT NULL,
                           `date` datetime DEFAULT NULL,
                           `object_id` bigint(20) DEFAULT NULL,
                           `object_name` varchar(255) DEFAULT NULL,
                           `user_id` bigint(20) DEFAULT NULL,
                           `username` varchar(255) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `teacher_seq`
--

CREATE TABLE `teacher_seq` (
    `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `users_roles`
--

CREATE TABLE `users_roles` (
                               `user_id` bigint(20) NOT NULL,
                               `role_id` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `user_app`
--

CREATE TABLE `user_app` (
                            `id` bigint(20) NOT NULL,
                            `account_non_expired` bit(1) NOT NULL,
                            `account_non_locked` bit(1) NOT NULL,
                            `created_at` datetime DEFAULT NULL,
                            `credentials_non_expired` bit(1) NOT NULL,
                            `email` varchar(255) DEFAULT NULL,
                            `enabled` bit(1) NOT NULL,
                            `nom` varchar(255) DEFAULT NULL,
                            `password` varchar(255) DEFAULT NULL,
                            `password_changed` bit(1) NOT NULL,
                            `prenom` varchar(255) DEFAULT NULL,
                            `updated_at` datetime DEFAULT NULL,
                            `username` varchar(255) DEFAULT NULL,
                            `etablissement` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

--
-- Index pour les tables dÃ©chargÃ©es
--

--
-- Index pour la table `etablissement`
--
ALTER TABLE `etablissement`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `free_trial`
--
ALTER TABLE `free_trial`
    ADD PRIMARY KEY (`id`),
  ADD KEY `FKi2xcoes6hxhaprbldr112b52y` (`free_trial_configuration`),
  ADD KEY `FKlubi1b1elkvwir6k3q6d7kyhp` (`free_trial_student_email_template`),
  ADD KEY `FKdt2i36mdw4j4nhv7r8vtsfy9b` (`free_trial_student_whats_template`),
  ADD KEY `FK62crw4si85tffn9o1tx2v5upl` (`free_trial_teacher_email_template`),
  ADD KEY `FKnd3xndb7bgblcjffm9wro6du` (`free_trial_teacher_whats_template`),
  ADD KEY `FK5gexid3f6mwgfdebqx71vmi6q` (`level`),
  ADD KEY `FKjsw8mj62tss7mde81eh9cr7v4` (`statut_free_trial`),
  ADD KEY `FKc1x8pnjmap4bgeogmktdnqjg6` (`teacher`);

--
-- Index pour la table `free_trial_configuration`
--
ALTER TABLE `free_trial_configuration`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `free_trial_detail`
--
ALTER TABLE `free_trial_detail`
    ADD PRIMARY KEY (`id`),
  ADD KEY `FK22so7d7qi1cuyghw3sf8tj7ux` (`free_trial`),
  ADD KEY `FK6iamjh7yty1xiw44392xsx6y8` (`student`);

--
-- Index pour la table `free_trial_student_email_template`
--
ALTER TABLE `free_trial_student_email_template`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `free_trial_student_whats_template`
--
ALTER TABLE `free_trial_student_whats_template`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `free_trial_teacher_email_template`
--
ALTER TABLE `free_trial_teacher_email_template`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `free_trial_teacher_whats_template`
--
ALTER TABLE `free_trial_teacher_whats_template`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `level`
--
ALTER TABLE `level`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `permission`
--
ALTER TABLE `permission`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `roles_permissions`
--
ALTER TABLE `roles_permissions`
    ADD KEY `FKboeuhl31go7wer3bpy6so7exi` (`permission_id`),
  ADD KEY `FK3q3rt3at2wf4ooe7npa3et6yb` (`role_id`);

--
-- Index pour la table `role_app`
--
ALTER TABLE `role_app`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `services`
--
ALTER TABLE `services`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `statut_free_trial`
--
ALTER TABLE `statut_free_trial`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `student`
--
ALTER TABLE `student`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `teacher`
--
ALTER TABLE `teacher`
    ADD PRIMARY KEY (`id`);

--
-- Index pour la table `users_roles`
--
ALTER TABLE `users_roles`
    ADD KEY `FK4e8pdqeupv69eukb2bvy2ftbd` (`role_id`),
  ADD KEY `FK50gpsre6oxwwqf394f8wov1yf` (`user_id`);

--
-- Index pour la table `user_app`
--
ALTER TABLE `user_app`
    ADD PRIMARY KEY (`id`),
  ADD KEY `FK2xblr2jfuwcj4ktkjxbf8ir13` (`etablissement`);
SET FOREIGN_KEY_CHECKS=1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
