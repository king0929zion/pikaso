.class public final Landroidx/lifecycle/n;
.super Landroidx/lifecycle/g;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onActivityCreated(Landroid/app/Activity;Landroid/os/Bundle;)V
    .locals 0

    const-string p2, "activity"

    invoke-static {p1, p2}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroidx/lifecycle/D;->e:I

    invoke-static {p1}, Landroidx/lifecycle/E;->c(Landroid/app/Activity;)V

    return-void
.end method
