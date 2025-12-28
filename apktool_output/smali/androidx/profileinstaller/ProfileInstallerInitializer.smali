.class public Landroidx/profileinstaller/ProfileInstallerInitializer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LB1/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LB1/b;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    new-instance v0, LR/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1, p1}, LR/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    invoke-static {v0}, Lx1/i;->a(Ljava/lang/Runnable;)V

    new-instance p1, Ls1/c;

    const/16 v0, 0x9

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Ls1/c;-><init>(IZ)V

    return-object p1
.end method
