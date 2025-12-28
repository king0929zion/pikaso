.class public final Lb/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/window/OnBackAnimationCallback;


# instance fields
.field public final synthetic a:Lo2/c;

.field public final synthetic b:Lo2/c;

.field public final synthetic c:Lo2/a;

.field public final synthetic d:Lo2/a;


# direct methods
.method public constructor <init>(Lo2/c;Lo2/c;Lo2/a;Lo2/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/p;->a:Lo2/c;

    iput-object p2, p0, Lb/p;->b:Lo2/c;

    iput-object p3, p0, Lb/p;->c:Lo2/a;

    iput-object p4, p0, Lb/p;->d:Lo2/a;

    return-void
.end method


# virtual methods
.method public final onBackCancelled()V
    .locals 1

    iget-object v0, p0, Lb/p;->d:Lo2/a;

    invoke-interface {v0}, Lo2/a;->c()Ljava/lang/Object;

    return-void
.end method

.method public final onBackInvoked()V
    .locals 1

    iget-object v0, p0, Lb/p;->c:Lo2/a;

    invoke-interface {v0}, Lo2/a;->c()Ljava/lang/Object;

    return-void
.end method

.method public final onBackProgressed(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/p;->b:Lo2/c;

    new-instance v1, Lb/b;

    invoke-direct {v1, p1}, Lb/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onBackStarted(Landroid/window/BackEvent;)V
    .locals 2

    const-string v0, "backEvent"

    invoke-static {p1, v0}, Lp2/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lb/p;->a:Lo2/c;

    new-instance v1, Lb/b;

    invoke-direct {v1, p1}, Lb/b;-><init>(Landroid/window/BackEvent;)V

    invoke-interface {v0, v1}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
