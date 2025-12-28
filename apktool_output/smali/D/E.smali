.class public final LD/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD/w0;


# instance fields
.field public final d:Lo2/c;

.field public e:LD/F;


# direct methods
.method public constructor <init>(Lo2/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/E;->d:Lo2/c;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, LD/E;->e:LD/F;

    if-eqz v0, :cond_0

    invoke-interface {v0}, LD/F;->a()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, LD/E;->e:LD/F;

    return-void
.end method

.method public final b()V
    .locals 2

    sget-object v0, LD/d;->h:LD/G;

    iget-object v1, p0, LD/E;->d:Lo2/c;

    invoke-interface {v1, v0}, Lo2/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LD/F;

    iput-object v0, p0, LD/E;->e:LD/F;

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method
