.class public final LD/J0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Iterable;
.implements Lq2/a;


# instance fields
.field public final d:LD/B0;

.field public final e:I

.field public final f:LD/d;


# direct methods
.method public constructor <init>(LD/B0;ILD/L;LD/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LD/J0;->d:LD/B0;

    iput p2, p0, LD/J0;->e:I

    iput-object p4, p0, LD/J0;->f:LD/d;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 5

    new-instance v0, LD/K;

    iget-object v1, p0, LD/J0;->f:LD/d;

    iget-object v2, p0, LD/J0;->d:LD/B0;

    iget v3, p0, LD/J0;->e:I

    const/4 v4, 0x0

    invoke-direct {v0, v2, v3, v4, v1}, LD/K;-><init>(LD/B0;ILD/L;LD/d;)V

    return-object v0
.end method
