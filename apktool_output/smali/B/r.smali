.class public final Lb/r;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LM1/h;

.field public final b:Ld2/i;

.field public c:Ls1/f;

.field public final d:Landroid/window/OnBackInvokedCallback;

.field public e:Landroid/window/OnBackInvokedDispatcher;

.field public f:Z


# direct methods
.method public constructor <init>(LM1/h;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb/r;->a:LM1/h;

    new-instance p1, Ld2/i;

    invoke-direct {p1}, Ld2/i;-><init>()V

    iput-object p1, p0, Lb/r;->b:Ld2/i;

    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x21

    if-lt p1, v0, :cond_1

    const/16 v0, 0x22

    if-lt p1, v0, :cond_0

    sget-object p1, Lb/q;->a:Lb/q;

    new-instance v0, Lb/l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lb/l;-><init>(Lb/r;I)V

    new-instance v1, Lb/l;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lb/l;-><init>(Lb/r;I)V

    new-instance v2, Lb/m;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lb/m;-><init>(Lb/r;I)V

    new-instance v3, Lb/m;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lb/m;-><init>(Lb/r;I)V

    invoke-virtual {p1, v0, v1, v2, v3}, Lb/q;->a(Lo2/c;Lo2/c;Lo2/a;Lo2/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lb/o;->a:Lb/o;

    new-instance v0, Lb/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lb/m;-><init>(Lb/r;I)V

    invoke-virtual {p1, v0}, Lb/o;->a(Lo2/a;)Landroid/window/OnBackInvokedCallback;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lb/r;->d:Landroid/window/OnBackInvokedCallback;

    :cond_1
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 4

    iget-object v0, p0, Lb/r;->c:Ls1/f;

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-object v0, p0, Lb/r;->b:Ld2/i;

    invoke-virtual {v0}, Ld2/i;->a()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/util/AbstractList;->listIterator(I)Ljava/util/ListIterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ls1/f;

    iget-boolean v3, v3, Ls1/f;->a:Z

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v1

    :goto_0
    move-object v0, v2

    check-cast v0, Ls1/f;

    :cond_2
    iput-object v1, p0, Lb/r;->c:Ls1/f;

    if-nez v0, :cond_3

    iget-object v0, p0, Lb/r;->a:LM1/h;

    invoke-virtual {v0}, LM1/h;->run()V

    return-void

    :cond_3
    iget-object v0, v0, Ls1/f;->b:LB2/i;

    invoke-virtual {v0}, LB2/i;->i()V

    throw v1
.end method
