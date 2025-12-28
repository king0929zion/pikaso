.class public final LB2/z;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LB2/A;

.field public static final b:LB2/A;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LB2/A;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LB2/A;-><init>(I)V

    sput-object v0, LB2/z;->a:LB2/A;

    new-instance v0, LB2/A;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LB2/A;-><init>(I)V

    sput-object v0, LB2/z;->b:LB2/A;

    return-void
.end method
