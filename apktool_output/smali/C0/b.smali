.class public abstract LC0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LC0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, LC0/a;

    invoke-direct {v0}, Landroid/text/style/CharacterStyle;-><init>()V

    sput-object v0, LC0/b;->a:LC0/a;

    return-void
.end method
