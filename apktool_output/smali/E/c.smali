.class public final LE/c;
.super Lr2/a;
.source "SourceFile"


# instance fields
.field public final b:LE/A;

.field public final c:LE/A;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, LE/A;

    invoke-direct {v0}, LE/A;-><init>()V

    iput-object v0, p0, LE/c;->b:LE/A;

    new-instance v0, LE/A;

    invoke-direct {v0}, LE/A;-><init>()V

    iput-object v0, p0, LE/c;->c:LE/A;

    return-void
.end method
