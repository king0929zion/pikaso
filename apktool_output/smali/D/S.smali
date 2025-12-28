.class public final LD/S;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/w0;


# instance fields
.field public final d:Lo2/e;

.field public final e:LD2/d;

.field public f:Ly2/h0;


# direct methods
.method public constructor <init>(Lg2/i;Lo2/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, LD/S;->d:Lo2/e;

    invoke-static {p1}, Ly2/v;->a(Lg2/i;)LD2/d;

    move-result-object p1

    iput-object p1, p0, LD/S;->e:LD2/d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, LD/S;->f:Ly2/h0;

    if-eqz v0, :cond_0

    new-instance v1, LC2/o;

    invoke-direct {v1}, LC2/o;-><init>()V

    invoke-virtual {v0, v1}, Ly2/b0;->B(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LD/S;->f:Ly2/h0;

    return-void
.end method

.method public final b()V
    .locals 5

    iget-object v0, p0, LD/S;->f:Ly2/h0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance v2, Ljava/util/concurrent/CancellationException;

    const-string v3, "Old job was still running!"

    invoke-direct {v2, v3}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    invoke-virtual {v0, v2}, Ly2/b0;->B(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, LD/S;->d:Lo2/e;

    const/4 v2, 0x0

    iget-object v3, p0, LD/S;->e:LD2/d;

    const/4 v4, 0x3

    invoke-static {v3, v1, v2, v0, v4}, Ly2/v;->l(Ly2/u;Lg2/a;ILo2/e;I)Ly2/h0;

    move-result-object v0

    iput-object v0, p0, LD/S;->f:Ly2/h0;

    return-void
.end method

.method public final c()V
    .locals 2

    iget-object v0, p0, LD/S;->f:Ly2/h0;

    if-eqz v0, :cond_0

    new-instance v1, LC2/o;

    invoke-direct {v1}, LC2/o;-><init>()V

    invoke-virtual {v0, v1}, Ly2/b0;->B(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LD/S;->f:Ly2/h0;

    return-void
.end method
